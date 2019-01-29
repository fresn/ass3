package com.example.mz198.ass3;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;

public class MyRelativeLayout extends AppCompatActivity {

    RatingBar ratingBar;
    ImageView imageView;
    ProgressBar progressBar;
    Button buttonWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_relative_layout);


        progressBar =findViewById(R.id.progressBar);

        ratingBar = findViewById(R.id.ratingBar);
        ratingBar.getRating();
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(),String.valueOf(rating),Toast.LENGTH_SHORT).show();
                switch (String.valueOf(rating)){
                    case "0":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_0_5));
                        break;
                    case "0.5":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.start_05_5));
                        break;
                    case "1.0":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_1_5));
                        break;
                    case "1.5":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_15_5));
                        break;
                    case "2.0":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_2_5));
                        break;
                    case "2.5":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_25_5));
                        break;
                    case "3.0":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_3_5));
                        break;
                    case "3.5":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_35_5));
                        break;
                    case "4.0":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_4_5));
                        break;
                    case "4.5":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_45_5));
                        break;
                    case "5.0":
                        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_5_5));
                        break;
                }
                progressBar.setProgress((int)rating*100/5);

            }
        });

        imageView = findViewById(R.id.imageViewStar);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.star_0_5));

        buttonWebView = findViewById(R.id.btnWebView);
        buttonWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getApplicationContext(),MyWebView.class);
                startActivity(intent);
            }
        });



    }
}
