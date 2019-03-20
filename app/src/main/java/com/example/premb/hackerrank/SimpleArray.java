package com.example.premb.hackerrank;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;

public class SimpleArray extends Activity {
public Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_array);


    }
    public void compiler2(View V)
    {
        Intent i=new Intent(this,Compiler.class);
        startActivity(i);
    }
}
