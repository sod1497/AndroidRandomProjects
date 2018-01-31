package com.example.sod14.listaactualizada.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.sod14.listaactualizada.R;

/**
 * Created by sod14 on 06/12/2017.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder
{
    public TextView name,ip,num;

    public ItemViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.tvName);
        ip = (TextView) itemView.findViewById(R.id.tvIP);
        num = (TextView) itemView.findViewById(R.id.tvNumber);

    }
}
