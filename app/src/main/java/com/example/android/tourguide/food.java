package com.example.android.tourguide;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class food extends AppCompatActivity {

    ArrayList<storeItem> storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        storage = new ArrayList<storeItem>();

        storage.add(new storeItem(R.drawable.chickenrice, "Chicken Rice"));
        storage.add(new storeItem(R.drawable.nasilemak, "Nasi Lemak"));

        itemAdapter adapter = new itemAdapter(this, storage);

        ListView listView = (ListView)findViewById(R.id.activity_food);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent(food.this, FoodDetail.class);
                intent.putExtra("imageID", storage.get(position).getImageResourceId());
                intent.putExtra("text", storage.get(position).getItemName());
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
