package com.example.googleimageviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mindorks.placeholderview.PlaceHolderView;

public class MainActivity extends AppCompatActivity {

    private PlaceHolderView mGalleryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGalleryView = (PlaceHolderView)findViewById(R.id.galleryView);
        mGalleryView.addView(new GalleryItem(getResources().getDrawable(R.drawable.image_1)));
        mGalleryView.addView(new GalleryItem(getResources().getDrawable(R.drawable.image_2)));
        mGalleryView.addView(new GalleryItem(getResources().getDrawable(R.drawable.image_3)));
        mGalleryView.addView(new GalleryItem(getResources().getDrawable(R.drawable.image_4)));
        mGalleryView.addView(new GalleryItem(getResources().getDrawable(R.drawable.image_5)));
    }
}
