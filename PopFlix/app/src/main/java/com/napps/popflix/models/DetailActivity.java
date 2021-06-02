package com.napps.popflix.models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.napps.popflix.R;

public class DetailActivity extends AppCompatActivity {
    String MovieTitle;
    String MovieOverview;
    double MovieRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //implementation
    }
}