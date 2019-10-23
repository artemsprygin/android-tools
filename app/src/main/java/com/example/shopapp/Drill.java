package com.example.shopapp;

import androidx.annotation.NonNull;

public class Drill {
    private String title;
    private String info;
    private int imgResourceID;

    public Drill(String title, String info, int imgResourceID) {
        this.title = title;
        this.info = info;
        this.imgResourceID = imgResourceID;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImgResourceID() {
        return imgResourceID;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
