package com.example.prashant.design3;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;


public class RecyclerViewActivity extends AppCompatActivity implements ImageItemClickListner {
public static final String EXTRA_IMAGE_ITEM="Image_Url";
public static final String EXTRA_IMAGE_TRANSITION_NAME = "IMAGE_transition_Name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        ImageGalleryAdapter imageGalleryAdapter = new ImageGalleryAdapter(Utils.generateAnimalItems(this),this,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(imageGalleryAdapter);
    }


    @Override
    public void onAnimalItemClick(int pos, ImageItem animalItem, ImageView shareImageView) {
        Intent intent = new Intent(this,ImageDetailActivity.class);
        intent.putExtra(EXTRA_IMAGE_ITEM, (Parcelable) animalItem);
        intent.putExtra(EXTRA_IMAGE_TRANSITION_NAME,ViewCompat.getTransitionName(shareImageView));
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,shareImageView,ViewCompat.getTransitionName(shareImageView));

    startActivity(intent,options.toBundle());
    }
}
