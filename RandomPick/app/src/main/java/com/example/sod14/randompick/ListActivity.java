package com.example.sod14.randompick;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sod14.randompick.ListActivityElements.ElementListItem;
import com.example.sod14.randompick.ListActivityElements.ElementListItemsAdapter;
import com.example.sod14.randompick.Logic.ElementList;
import com.example.sod14.randompick.Logic.ElementListManager;
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

    static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 1;

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

        etElement.setOnKeyListener(new View.OnKeyListener()
        {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    switch (keyCode)
                    {
                        case KeyEvent.KEYCODE_DPAD_CENTER:
                        case KeyEvent.KEYCODE_ENTER:
                            addButtonClick(etElement);
                            return true;
                        default:
                            break;
                    }
                }
                return false;
            }
        });


        String name = getIntent().getStringExtra("name");
        List<ElementList<String>> lists = manager.getLists();
        int a=0;
        while(a<lists.size())
        {
            if(lists.get(a).getName().equals(name)) break;
            a++;
        }
        elementList = lists.get(a);

        this.setTitle(elementList.getName());

        adapter = new ElementListItemsAdapter(elementList);
        recyclerView.setAdapter(adapter);
        elementListItem = new ArrayList<>();

        loadData();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();


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
        Snackbar snackbar = Snackbar.make(v,R.string.add_some_text, BaseTransientBottomBar.LENGTH_SHORT);
        if(etElement.getText().toString().length()==0) snackbar.show();
        else{
            String element = etElement.getText().toString();
            elementList.getElements().add(element);
            snackbar.setText(etElement.getText().toString()+" "+getString(R.string.added));
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
            case R.id.detailsButton:
                Intent intent = new Intent(this,AddListActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT,elementList.getName());
                startActivity(intent);

                //recibir el nombre de la nueva lista y actualizar los datos actuales

                return true;
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
            case R.id.exportListButton:
                if(isExternalStorageWritable())
                {
                    if (ContextCompat.checkSelfPermission(this,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE)
                            != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(this,
                                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                                MY_PERMISSIONS_REQUEST_READ_CONTACTS);
                    }

                }
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    /* Checks if external storage is available for read and write */
    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_READ_CONTACTS: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    manager.exportList(elementList);

                } else {

                    Toast.makeText(this, R.string.need_permission,Toast.LENGTH_LONG).show();
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }
}
