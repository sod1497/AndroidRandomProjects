package com.example.sod14.randompick;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.sod14.randompick.Logic.ElementList;
import com.example.sod14.randompick.Logic.ElementListManager;
import com.example.sod14.randompick.MainActivityElements.MainListItem;
import com.example.sod14.randompick.MainActivityElements.MainListItemsAdapter;
import com.example.sod14.randompick.Persistence.ActiveData;

import java.io.File;
import java.util.List;

public class ListMenuActivity extends AppCompatActivity {


    private ActiveData activeData;
    private ElementListManager manager;
    private MainListItemsAdapter adapter;
    private List<MainListItem> mainListItems;
    private RecyclerView recyclerView;
    private static final int FILE_SELECT_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        //Add the toolbar always after the setcontentview method
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarListMenu);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);

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

    private void loadData() {
        mainListItems.clear();
        List<ElementList<String>> lists = this.manager.getLists();
        MainListItem item;
        for (ElementList<String> e : lists) {
            item = new MainListItem(e.getName(), e.getDescription(), e.getElements().size(), e.getColor());
            mainListItems.add(item);
            adapter.notifyItemInserted(mainListItems.indexOf(item));
        }
    }

    public void AddListClic(View v) {
        startActivity(new Intent(this, AddListActivity.class));
    }

    public void ElementClick(String name) {
        List<ElementList<String>> lists = manager.getLists();
        int a = 0;
        while (a < lists.size()) {
            if (lists.get(a).getName() == name) break;
            a++;
        }
        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.importBtn:

                if (isExternalStorageReadable()) {
                    showFileChooser();

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


    /* Checks if external storage is available to at least read */
    public boolean isExternalStorageReadable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            return true;
        }
        return false;
    }

    private void showFileChooser() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("text/plain");
        intent.addCategory(Intent.CATEGORY_OPENABLE);

        try {
            startActivityForResult(
                    Intent.createChooser(intent, "Select a File to Upload"),
                    FILE_SELECT_CODE);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "Please install a File Manager.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case FILE_SELECT_CODE:
                if (resultCode == RESULT_OK) {

                    // Get the Uri of the selected file
                    Uri uri = data.getData();
                    manager.importList(new File(uri.getPath()));

                    loadData();
                }
        }
    }


}
