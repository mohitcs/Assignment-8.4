package com.wedddingapp.shankar.gryytext;

import android.graphics.Bitmap;

/**
 * Created by shan on 12/9/2017.
 */

public class Item {
    Bitmap image;
    String title;

    public Item(Bitmap image, String title) {
        super();
        this.image = image;
        this.title = title;
    }
    public Bitmap getImage() {
        return image;
    }
    public void setImage(Bitmap image) {
        this.image = image;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


}

