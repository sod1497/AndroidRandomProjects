package com.example.sod14.randompick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sod14.randompick.Logic.ElementList;
import com.example.sod14.randompick.Logic.ElementListManager;

public class MainActivity extends AppCompatActivity {
    private ElementListManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = new ElementListManager(this);

    }

    //For testing
    public void OnClick(View v)
    {
        ElementList<String> list = new ElementList<>();
        list.setName("list1");
        list.getElements().add("el1");
        manager.addList(list);
    }
}
