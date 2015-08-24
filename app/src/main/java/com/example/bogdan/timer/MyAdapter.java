package com.example.bogdan.timer;

import java.text.DateFormat;
import java.util.Calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private static final int COUNT = 30;

    private Context context;
    private DateFormat dateFormat;

    public MyAdapter(Context context) {

        this.context = context;
        dateFormat = DateFormat.getTimeInstance();
    }

    @Override
    public int getCount() {

        return COUNT;
    }

    @Override
    public String getItem( int position ) {

        return "Item " + String.valueOf( position );
    }

    @Override
    public long getItemId( int position ) {

        return position;
    }

    @Override
    public View getView( int position, View convertView, ViewGroup parent ) {

        if ( convertView == null ) {
            convertView = LayoutInflater.from( getContext() ).inflate( android.R.layout.two_line_list_item, parent, false );
        }

        TextView text1 = (TextView) convertView.findViewById( android.R.id.text1 );
        TextView text2 = (TextView) convertView.findViewById( android.R.id.text2 );

        text1.setText( getItem( position ) );
        text2.setText( getTimeString( position ) );

        return convertView;
    }

    private CharSequence getTimeString( int position ) {

            return dateFormat.format( Calendar.getInstance().getTime() );
    }

    private Context getContext() {

        return context;
    }
}
