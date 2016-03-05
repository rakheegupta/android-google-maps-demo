package com.example.mapdemo;

import org.parceler.Parcels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MapLauncherActivity extends AppCompatActivity {
    ArrayList<Item> mItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_launcher);
        mItems=Item.loadItems();
    }

    public void launchMap(View view) {
        Intent i = new Intent(this,MapDemoActivity.class);
        i.putExtra("items", Parcels.wrap(mItems));
        startActivity(i);
    }


}
