package com.example.prashant.design3;


import android.content.Context;

import java.util.ArrayList;

public class Utils {

    public static ArrayList<ImageItem> generateAnimalItems(Context context) {
        ArrayList<ImageItem> imageItem = new ArrayList<>();

        imageItem.add(new ImageItem("Hindhu", context.getString(R.string.hindhu), "https://images.pexels.com/photos/1446161/pexels-photo-1446161.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        imageItem.add(new ImageItem("ISLAM", context.getString(R.string.Muslim), "https://www.elsetge.cat/myimg/f/54-541979_sad-muslim-girl-wallpaper-labzada-wallpaper-muslim.jpg"));
        imageItem.add(new ImageItem("SIKH", context.getString(R.string.skih), "https://onehdwallpaper.com/wp-content/uploads/2015/06/Punjabi-Girls-Group-Phtos-and-Wallpaper-for-Desktop-800x592.jpg"));
        imageItem.add(new ImageItem("christian", context.getString(R.string.christian), "https://media.gettyimages.com/photos/let-the-little-children-come-to-me-picture-id603153110?s=2048x2048"));
        imageItem.add(new ImageItem("Buddhist", context.getString(R.string.Budhism), "https://thumbs.dreamstime.com/b/buddhist-asian-girl-close-up-beautiful-sit-wooden-mat-praying-meditation-garden-74462127.jpg"));
        imageItem.add(new ImageItem("ChineseOld", context.getString(R.string.china), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStjjcP31OCsZokE_iDc2WTBMqDqqeJBLorY-QnN5AaN9JjZMPIfg"));
        imageItem.add(new ImageItem("African tribial", context.getString(R.string.shinto), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThF4-NZgfbEx4RD48e1YcMexCjDFU2e9CXkP-pfUotyNnQ54qD"));
        imageItem.add(new ImageItem("shinto", context.getString(R.string.shinto), "https://i.pinimg.com/originals/e1/93/ec/e193ec5412a2858ccb5a18f4d0ef94fe.jpg"));//shinto girl
        imageItem.add(new ImageItem("juche",context.getString(R.string.shinto), "https://ih0.redbubble.net/image.547042277.4873/aldr,x1700,front-c,185,103,750,1000-bg,f8f8f8.jpg")); //juche religion
        imageItem.add(new ImageItem("Unitarian-Universalism", context.getString(R.string.shinto), "https://www.shorelineunitarian.org/wp-content/uploads/2015/07/Amy-Buckley-300x300.jpg"));//Unitarian-Universalism
        return imageItem;
    }
}
