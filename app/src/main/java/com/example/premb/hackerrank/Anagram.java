package com.example.premb.hackerrank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Anagram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anagram);
    }
    public void compiler2(View V)
    {
        Intent i=new Intent(this,Compiler.class);
        startActivity(i);
    }
}
