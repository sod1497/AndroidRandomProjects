package com.example.sod14.randompick.Logic;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by sod14 on 16/02/2018.
 */

public class OrderedArrayList implements Iterable<String>,Serializable{
    ArrayList<java.lang.String> arrayList;

    public OrderedArrayList() {
        arrayList=new ArrayList<>();
    }

    public int add(java.lang.String element)
    {
        if(arrayList.contains(element))
        {
            return -1;
        }
        else{
            arrayList.add(element);

            Collections.sort(arrayList);

            return arrayList.indexOf(element);
        }
    }

    public boolean contains(String element)
    {
        return arrayList.contains(element);
    }

    public String get(int index)
    {
        return arrayList.get(index);
    }

    public int indexOf(String element)
    {
        return arrayList.indexOf(element);
    }

    @NonNull
    @Override
    public Iterator<String> iterator() {
        return arrayList.iterator();
    }

    public int size()
    {
        return arrayList.size();
    }

    public void addAll(Collection<String> collection)
    {
        for(String s : collection)
        {
            this.add(s);
        }
    }

    public ArrayList<String> getArrayList()
    {
        return arrayList;
    }
}
