package com.example.prashant.design3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.System.in;

public class ImageItem implements Parcelable {






    public static final Creator<ImageItem> CREATOR = new Creator<ImageItem>() {
        @Override
        public ImageItem createFromParcel(Parcel in) {
            return new ImageItem(in);
        }

        @Override
        public ImageItem[] newArray(int size) {
            return new ImageItem[size];
        }
    };
   public String name;
   public String detail;
   public String imageUrl;




    public ImageItem(String name, String detail, String imageUrl) {
        this.name =name;
        this.detail = detail;
        this.imageUrl = imageUrl;
    }
    protected ImageItem(Parcel in) {
        name = in.readString();
        detail = in.readString();
        imageUrl = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeString(imageUrl);
    }
}
