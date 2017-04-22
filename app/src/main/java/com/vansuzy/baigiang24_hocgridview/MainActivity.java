package com.vansuzy.baigiang24_hocgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.vansuzy.adapter.HinhAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvHinh;
    ArrayList<Integer> dsHinh;
    HinhAdapter hinhAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
    }

    private void addControls() {
        gvHinh = (GridView) findViewById(R.id.gvHinh);

        dsHinh = new ArrayList<>();
        dsHinh.add(R.drawable.h1);
        dsHinh.add(R.drawable.h2);
        dsHinh.add(R.drawable.h3);
        dsHinh.add(R.drawable.h4);
        dsHinh.add(R.drawable.h5);
        dsHinh.add(R.drawable.h6);
        dsHinh.add(R.drawable.h7);
        dsHinh.add(R.drawable.h8);
        dsHinh.add(R.drawable.h9);
        dsHinh.add(R.drawable.h10);
        dsHinh.add(R.drawable.h11);

        hinhAdapter = new HinhAdapter(
                MainActivity.this,
                R.layout.item,
                dsHinh
        );
        gvHinh.setAdapter(hinhAdapter);
    }
}
