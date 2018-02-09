package com.example.sod14.randompick;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.example.sod14.randompick.Logic.ElementList;
import com.example.sod14.randompick.Logic.ElementListManager;
import com.example.sod14.randompick.MainActivityElements.MainListItem;
import com.example.sod14.randompick.MainActivityElements.MainListItemsAdapter;
import com.example.sod14.randompick.Persistence.ActiveData;

import java.util.List;

public class ListMenuActivity extends AppCompatActivity {


    private ActiveData activeData;
    private ElementListManager manager;
    private MainListItemsAdapter adapter;
    private List<MainListItem> mainListItems;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        //Add the toolbar always after the setcontentview method
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarListMenu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        activeData = ActiveData.getInstance();
        activeData.setMainActivity(this);
        manager = activeData.getManager();
        mainListItems = activeData.getMainListItems();
        adapter = activeData.getMainListItemsAdapter();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        loadData();
    }

    @Override
    protected void onResume() {
        super.onResume();

        mainListItems = activeData.getMainListItems();
        adapter = activeData.getMainListItemsAdapter();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        loadData();

    }

    private void loadData()
    {
        mainListItems.clear();
        List<ElementList<String>> lists = this.manager.getLists();
        MainListItem item;
        for(ElementList<String> e:lists)
        {
            item = new MainListItem(e.getName(),e.getDescription(),e.getElements().size(),e.getColor());
            mainListItems.add(item);
            adapter.notifyItemInserted(mainListItems.indexOf(item));
        }
    }

    public void AddListClic(View v)
    {
        startActivity(new Intent(this,AddListActivity.class));
    }

    public void ElementClick(String name)
    {
        List<ElementList<String>> lists = manager.getLists();
        int a=0;
        while(a<lists.size())
        {
            if(lists.get(a).getName()==name) break;
            a++;
        }
        Intent intent = new Intent(this,ListActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return true;
    }



}
