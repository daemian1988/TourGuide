package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Daemian on 1/7/2016.
 */

public class itemAdapter extends ArrayAdapter<storeItem> {

    public itemAdapter(Activity context, ArrayList<storeItem> items)
    {
        super(context, 0, items);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list__item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        storeItem currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView tv = (TextView) listItemView.findViewById(R.id.text_view_display);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        tv.setText(currentItem.getItemName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageIC);

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon

        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentItem.getImageResourceId());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
