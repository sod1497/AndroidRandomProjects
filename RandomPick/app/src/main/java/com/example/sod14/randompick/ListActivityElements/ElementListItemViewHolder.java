package com.example.sod14.randompick.ListActivityElements;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sod14.randompick.R;

/**
 * Created by sod14 on 31/01/2018.
 */

public class ElementListItemViewHolder extends RecyclerView.ViewHolder {

    public TextView name;

    public ElementListItemViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.tvElementName);
    }
}
