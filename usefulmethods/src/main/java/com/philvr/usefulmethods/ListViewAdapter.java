package com.philvr.usefulmethods;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * @author Philip Van Raalte
 * @date 2017-06-24
 */

public class ListViewAdapter extends ArrayAdapter<String> {
    private ArrayList<String> items;

    public ListViewAdapter(@NonNull Context context, ArrayList<String> items) {
        super(context, 0, items);
        this.items = items;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        final String item = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(this.getContext())
                    .inflate(R.layout.string_item, parent, false);
        }

        if(item != null){
            LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.linearLayout);
        }

        return convertView;
    }
}
