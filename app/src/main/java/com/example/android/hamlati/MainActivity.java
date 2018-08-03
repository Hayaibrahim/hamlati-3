package com.example.android.hamlati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openTappedActivity(View v){
        Intent i = new Intent(getApplicationContext(),ratingPlace.class);
        startActivity(i);
        setContentView(R.layout.activity_transportation);
    }
}
