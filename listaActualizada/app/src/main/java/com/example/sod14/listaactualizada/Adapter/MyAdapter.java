package com.example.sod14.listaactualizada.Adapter;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sod14.listaactualizada.Model.ItemClient;
import com.example.sod14.listaactualizada.R;

import java.util.List;

/**
 * Created by sod14 on 06/12/2017.
 */


public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<ItemClient> items;
    Activity activity;

    public MyAdapter(List <ItemClient> items, Activity activity) {
        this.items = items;
        this.activity = activity;
    }

    /*

    /*
    Indicar que layout quiero usar para nuevos items
     */

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(
                LayoutInflater.from(activity).inflate(R.layout.item,parent,false));
        //devuelve un view para crear el itemviewholder con el layout que quiero
    }

    /*
    Actualiza la lista según los elementos que contiene mi colección (no su posición)
     */

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemClient item = items.get(position);
        ItemViewHolder viewHolder = (ItemViewHolder) holder;

        viewHolder.name.setText(items.get(position).getClientName());
        viewHolder.ip.setText(items.get(position).getClientIP());
        viewHolder.num.setText((items.get(position)).getItemNumber()+"");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
