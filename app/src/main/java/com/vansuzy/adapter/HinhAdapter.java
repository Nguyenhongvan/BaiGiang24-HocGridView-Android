package com.vansuzy.adapter;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.vansuzy.baigiang24_hocgridview.R;

import java.util.List;

/**
 * Created by keeps on 4/21/2017.
 */

public class HinhAdapter extends ArrayAdapter<Integer> {
    Activity context;
    int resource;
    List<Integer> objects;
    public HinhAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<Integer> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);
        ImageView imgHinh = (ImageView) row.findViewById(R.id.imgHinh);
        imgHinh.setImageResource(this.objects.get(position));
        return row;
    }
}
