package com.example.sod14.consultarexpedienteunirioja;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sod14 on 21/12/2017.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> frangments;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        frangments=new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        try{
            return frangments.get(position);
        }catch (IndexOutOfBoundsException e)
        {
            return null;
        }
    }

    @Override
    public int getCount() {
        return frangments.size();
    }
}
