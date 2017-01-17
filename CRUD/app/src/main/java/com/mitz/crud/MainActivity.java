package com.mitz.crud;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextName,editTextCountry;
    private Button button;
    private String country;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.mainName);
        editTextCountry = (EditText) findViewById(R.id.mainCountry);
        button = (Button) findViewById(R.id.mainButton);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //Log.v("tag","message");
        name = editTextName.getText().toString();
        country = editTextCountry.getText().toString();
        Log.v("name",name);
        Log.v("country",country);


        Intent intent = new Intent(this,NewActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("country", country);

        this.startActivity(intent);

    }
}
