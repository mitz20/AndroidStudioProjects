package com.example.androidquickstart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_name);

        TextView text = (TextView) findViewById(R.id.activity_confirm_name_text);
        String name = getIntent().getStringExtra("name");
        text.setText(name);
    }
}
