package com.example.sod14.randompick;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.sax.Element;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sod14.randompick.ListActivityElements.ElementListItem;
import com.example.sod14.randompick.ListActivityElements.ElementListItemsAdapter;
import com.example.sod14.randompick.Logic.ElementList;
import com.example.sod14.randompick.Logic.ElementListManager;
import com.example.sod14.randompick.MainActivityElements.MainListItem;
import com.example.sod14.randompick.Persistence.ActiveData;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ElementList<String> elementList;
    private ActiveData activeData;
    private ElementListItemsAdapter adapter;
    private RecyclerView recyclerView;
    private List<ElementListItem> elementListItem;
    private ElementListManager manager;

    private Button addButton;
    private EditText etElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarListActivity);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        activeData = ActiveData.getInstance();

        manager = activeData.getManager();

        recyclerView = findViewById(R.id.recyclerViewList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        etElement = findViewById(R.id.etElement);


        String name = getIntent().getStringExtra("name");
        List<ElementList<String>> lists = manager.getLists();
        int a=0;
        while(a<lists.size())
        {
            if(lists.get(a).getName().equals(name)) break;
            a++;
        }
        elementList = lists.get(a);

        adapter = new ElementListItemsAdapter(elementList);
        recyclerView.setAdapter(adapter);
        elementListItem = new ArrayList<>();

        loadData();
    }

    private void loadData()
    {

        ElementListItem item;
        for(String e:elementList.getElements())
        {
            item = new ElementListItem(e);
            elementListItem.add(item);
            adapter.notifyItemInserted(elementListItem.indexOf(item));
        }
        //If there are no elements, the user is driven to add one
        if(elementList.getElements().size()==0) etElement.requestFocus();
    }

    public void addButtonClick(View v)
    {
        Snackbar snackbar = Snackbar.make(v,"Introduce texto primero", BaseTransientBottomBar.LENGTH_SHORT);
        if(etElement.getText().toString().length()==0) snackbar.show();
        else{
            String element = etElement.getText().toString();
            elementList.getElements().add(element);
            snackbar.setText(etElement.getText().toString()+" añadido");
            etElement.setText("");
            snackbar.show();
            manager.saveList(elementList);
            adapter.notifyItemInserted(elementList.getElements().indexOf(element));
        }
    }

    public void randomButtonClick(View v)
    {
        RandomActivity activity = new RandomActivity(elementList);
        startActivity(activity.getIntent());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.list_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.deleteList:
                //Show confirmation dialog
                // 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                // 2. Chain together various setter methods to set the dialog characteristics
                builder.setTitle(R.string.confirmation_dialog);

                // Add the buttons
                builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //Remove list and file
                        manager.deleteList(elementList);
                        //Finnish activity
                        finish();
                    }
                });
                builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
                // 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
                dialog.show();

                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }


}
