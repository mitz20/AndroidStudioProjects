package com.mitz.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    //private static int counter;
    private static final String BUNDLE_COUNTER = "BUNDLE_COUNTER";
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.i(TAG,"----onCreate");

        if(savedInstanceState != null){
            counter = savedInstanceState.getInt(BUNDLE_COUNTER);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.activity_main_text);
        View button = findViewById(R.id.activity_main_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                textView.setText(Integer.toString(counter));
            }
        });
        //textView.setText(Integer.toString(counter));
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceBundle){
        super.onSaveInstanceState(savedInstanceBundle);

        savedInstanceBundle.putInt(BUNDLE_COUNTER,counter);
    }
}
