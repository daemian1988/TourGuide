package com.example.android.tourguide;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.value;

public class FoodDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tv = (TextView)findViewById(R.id.textViewTitle);
        ImageView iv = (ImageView)findViewById(R.id.imageView);
        TextView tvDesc = (TextView)findViewById(R.id.textViewDesc);

        String value = getIntent().getExtras().getString("text");
        int imgID = getIntent().getExtras().getInt("imageID");

        if(value.equals("Chicken Rice"))
        {
            tvDesc.setText(R.string.chickenRiceDesc);
        }
        else
        {
            tvDesc.setText(R.string.nasiDesc);
        }

        iv.setImageResource(imgID);
        tv.setText(value);

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
