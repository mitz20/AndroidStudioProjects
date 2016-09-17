package com.example.androidquickstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirmName(View view) {
        Intent confirmNameActivity = new Intent(this,ConfirmNameActivity.class);

        EditText nameText = (EditText) findViewById(R.id.activity_main_name);
        String name = nameText.getText().toString();
        confirmNameActivity.putExtra("name",name);

        startActivity(confirmNameActivity);
    }
}
