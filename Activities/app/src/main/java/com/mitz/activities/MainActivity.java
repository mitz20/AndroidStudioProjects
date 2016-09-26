package com.mitz.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private TextView textView;
    private View button;
    private EditText textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.activity_main_text);
        button = findViewById(R.id.activity_main_button);
        textBox = (EditText) findViewById(R.id.activity_main_editText);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == button){
            Intent intent =new Intent(this,SelectContactActivity.class);
            intent.putExtra(SelectContactActivity.EXTRA_TITLE,textBox.getText().toString());
            startActivity(intent);
        }
    }
}
