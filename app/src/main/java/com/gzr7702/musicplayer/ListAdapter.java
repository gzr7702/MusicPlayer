package com.gzr7702.musicplayer;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<SongItem> {

    private final Context context;
    private final ArrayList<SongItem> songArrayList;

    public ListAdapter(Context context, ArrayList<SongItem> songArrayList) {

        super(context, R.layout.listview_item, songArrayList);

        this.context = context;
        this.songArrayList = songArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View rowView = null;
        if(!songArrayList.get(position).isGroupHeader()){
            rowView = inflater.inflate(R.layout.listview_item, parent, false);

            ImageView imgView = (ImageView) rowView.findViewById(R.id.music_icon);
            TextView titleView = (TextView) rowView.findViewById(R.id.label);

            imgView.setImageResource(songArrayList.get(position).getIcon());
            titleView.setText(songArrayList.get(position).getTitle());
        }
        else{
            rowView = inflater.inflate(R.layout.listview_header, parent, false);
            TextView titleView = (TextView) rowView.findViewById(R.id.header);
            titleView.setText(songArrayList.get(position).getTitle());
        }

        return rowView;
    }
}
