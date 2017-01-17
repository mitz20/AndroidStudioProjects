package com.mitz.crud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by mitz on 01/10/16.
 */
public class NewActivity extends AppCompatActivity {
    private String name,country;
    private TextView textViewName,textViewCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
       // Log.v("newAct","hehe");

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        country = intent.getStringExtra("country");

        textViewName = (TextView) findViewById(R.id.newName);
        textViewCountry = (TextView) findViewById(R.id.newCountry);

        textViewName.setText(name);
        textViewCountry.setText(country);

    }

}
