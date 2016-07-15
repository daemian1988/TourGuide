package com.example.android.tourguide;

/**
 * Created by Daemian on 1/7/2016.
 */

public class storeItem {

    private int imageResourceId;
    private String itemName;

    public storeItem(int imageResourceId, String itemName)
    {
        this.imageResourceId = imageResourceId;
        this.itemName = itemName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }






}
