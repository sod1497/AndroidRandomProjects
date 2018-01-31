package com.example.sod14.listaactualizada.Persistence;

import com.example.sod14.listaactualizada.Adapter.MyAdapter;
import com.example.sod14.listaactualizada.Model.ItemClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sod14 on 06/12/2017.
 */

public class DataStorage {
    List<ItemClient> items;
    static DataStorage instance;

    private DataStorage() {
        items = new ArrayList<>();
    }

    public static DataStorage getInstance()
    {
        if(instance == null) instance=new DataStorage();
        return instance;
    }

    public List<ItemClient> getItems() {
        return items;
    }
}
