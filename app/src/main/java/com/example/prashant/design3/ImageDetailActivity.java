package com.example.prashant.design3;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class ImageDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);
        supportPostponeEnterTransition();
        Bundle extras = getIntent().getExtras();
        ImageItem imageItem = extras.getParcelable(RecyclerViewActivity.EXTRA_IMAGE_ITEM);

       ImageView imageView = findViewById(R.id.animal_detail_image_view);
        TextView textView = findViewById(R.id.animal_detail_text);
        textView.setText(imageItem.detail);
        String imageUrl = imageItem.imageUrl;
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
        {
            getWindow().setSharedElementEnterTransition(new ChangeBounds().setDuration(1000));
            String imageTransitionName = extras.getString(RecyclerViewActivity.EXTRA_IMAGE_TRANSITION_NAME);
            imageView.setTransitionName(imageTransitionName);
        }
        Picasso.get().load(imageUrl).noFade().into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                supportStartPostponedEnterTransition();
            }

            @Override
            public void onError(Exception e) {
                supportStartPostponedEnterTransition();

            }
        });
    }
}
