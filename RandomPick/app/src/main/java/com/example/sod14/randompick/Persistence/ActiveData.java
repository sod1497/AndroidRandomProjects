package com.example.sod14.randompick.Persistence;

import android.content.Context;

import com.example.sod14.randompick.Logic.ElementList;
import com.example.sod14.randompick.Logic.ElementListManager;

/**
 * Created by sod14 on 31/01/2018.
 */

public class ActiveData {
    private static ActiveData instance;

    private Context MainActivity;
    private Context ListActivity;
    private Context RandomActivity;
    private ElementListManager manager;

    private ActiveData()
    {

    }

    public static ActiveData getInstance()
    {
        if(instance==null) instance = new ActiveData();
        return instance;
    }

    public Context getMainActivity() {
        return MainActivity;
    }

    public void setMainActivity(Context mainActivity) {
        MainActivity = mainActivity;
    }

    public Context getListActivity() {
        return ListActivity;
    }

    public void setListActivity(Context listActivity) {
        ListActivity = listActivity;
    }

    public Context getRandomActivity() {
        return RandomActivity;
    }

    public void setRandomActivity(Context randomActivity) {
        RandomActivity = randomActivity;
    }

    public ElementListManager getManager() {
        return manager;
    }

    public void setManager(ElementListManager manager) {
        this.manager = manager;
    }
}
