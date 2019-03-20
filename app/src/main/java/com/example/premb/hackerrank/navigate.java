package com.example.premb.hackerrank;

import android.content.Intent;
import android.media.Image;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.Activity;

public class navigate extends AppCompatActivity {
ImageView in;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        in = (ImageView) findViewById(R.id.imageView);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Questions.class);
                startActivity(i);
            }
        });
    }
        public void error(View v)
        {
           Intent i=new Intent(this,Addquestions.class);
           startActivity(i);

        }



}
