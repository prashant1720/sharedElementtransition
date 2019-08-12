package com.example.prashant.design3;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageGalleryAdapter extends RecyclerView.Adapter<ImageGalleryAdapter.MyViewHolder> {
private final  ImageItemClickListner imageItemClickListner;
private final  ArrayList arrayList;
    public ImageGalleryAdapter(ArrayList<ImageItem> imageItems, RecyclerViewActivity recyclerViewActivity, ImageItemClickListner imageItemClickListner) {
this.arrayList = imageItems;
    this.imageItemClickListner = imageItemClickListner;
}




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemimagesquare,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(layout);

        return myViewHolder;
    }



    @Override
    public void onBindViewHolder(final MyViewHolder holder, int i) {




final ImageItem imageItem = (ImageItem) arrayList.get(i);

        Picasso.get().load(imageItem.imageUrl).into(holder.imageView_adapter);
        ViewCompat.setTransitionName(holder.imageView_adapter,imageItem.name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageItemClickListner.onAnimalItemClick(holder.getAdapterPosition(),imageItem,holder.imageView_adapter);
            }
        });


    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
ImageView imageView_adapter;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            imageView_adapter = itemView.findViewById(R.id.imageview_adapter);
        }
    }
}
