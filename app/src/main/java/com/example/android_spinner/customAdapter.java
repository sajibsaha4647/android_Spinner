package com.example.android_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends BaseAdapter {

    String [] countrynames;
    int [] flags;
    Context context;
    private LayoutInflater inflater;

    public customAdapter(MainActivity mainActivity, String[] countrynames, int[] flags) {
        this.context = mainActivity;
        this.flags = flags;
        this.countrynames = countrynames;

    }

    @Override
    public int getCount() {
        return countrynames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view =  inflater.inflate(R.layout.sample_view,viewGroup,false);
        }

        ImageView imageView = view.findViewById(R.id.scrollImageView);
        TextView textView = view.findViewById(R.id.scrollTextView);

        imageView.setImageResource(flags[i]);
        textView.setText(countrynames[i]);

        return view;
    }
}
