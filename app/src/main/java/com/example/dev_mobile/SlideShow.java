package com.example.dev_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SlideShow extends AppCompatActivity {
    ImageView imageView;
    Integer[] imagens = {R.drawable.abaixopeso, R.drawable.normal, R.drawable.obesidade1};
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_show);
        imageView = findViewById(R.id.ivSlide);
        position = 0;
    }

    public void next() {
        position++;
    }
}