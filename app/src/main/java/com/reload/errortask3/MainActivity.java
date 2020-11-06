package com.reload.errortask3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
ImageView favorite_border,favourite,star;
private int current_image;
int[] image={R.drawable.ic_favorite_24,R.drawable.ic_favorite_border_24};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        favorite_border=findViewById(R.id.favourite1);
        favorite_border.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current_image++;
                current_image=current_image % image.length;
                favorite_border.setImageResource(image[current_image]);
            }
        });
        star=findViewById(R.id.img_star1);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomMessageBox("Hello :)");
            }
        });


    }


    protected void CustomMessageBox(String message)
    {
        Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.custome_messbox);
        dialog.setTitle("Rate Us");
        RatingBar ratingBar=dialog.findViewById(R.id.rating_bar);
        ratingBar.setRating((float) 3.5);
        dialog.show();

    }
}