package com.example.sod14.listaactualizada;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sod14.listaactualizada.Adapter.MyAdapter;
import com.example.sod14.listaactualizada.Model.ItemClient;
import com.example.sod14.listaactualizada.Persistence.DataStorage;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ItemClient> items;
    MyAdapter adapter;

    EditText etName;
    EditText etIP;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        para cambio de diseño según la orientacion
        Creo el directiorio layout-land en res (no aparece)
        Copio el archivo de diseño en esa carpeta con el mismo nombre
        done
         */



        items = DataStorage.getInstance().getItems();

        etName = (EditText) findViewById(R.id.etName);
        etIP = (EditText) findViewById(R.id.etIP);

        recyclerView = (RecyclerView) findViewById(R.id.rvItems);
        adapter = new MyAdapter(items, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }



    public void bAddOnClic(View view) {
        String name = etName.getText().toString();
        String ip = etIP.getText().toString();
        int num = items.size() + 1;

        if (!name.equals("") && !ip.equals("")) {
            ItemClient item = new ItemClient(name, ip, num);
            items.add(item);
            adapter.notifyItemInserted(items.size() - 1);
            adapter.notifyDataSetChanged();
        } else {
            Toast.makeText(this, "The item must have a number and an IP", Toast.LENGTH_SHORT).show();
        }

    }

    public void clearEvenOnClic(View view) {
        for (int i = items.size() - 1; i >= 0; i -= 2) {
            if (i % 2 == 0) i--;
            if (i >= 0) {
                items.remove(i);
                adapter.notifyItemRemoved(i);
            }

        }

        updateNumbers();

        adapter.notifyDataSetChanged();
    }

    public void updateNumbers() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).setItemNumber(i + 1);
        }
    }
}
