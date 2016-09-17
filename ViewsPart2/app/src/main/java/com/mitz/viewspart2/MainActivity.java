package com.mitz.viewspart2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private TextView textView;
    private Button button;
    private int clickCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.activity_main_textView);
        button = (Button) findViewById(R.id.activity_main_button);

        button.setOnClickListener(this);
    }

    public void onClick(View view){
        if( view.getId() == R.id.activity_main_button ) {
            clickCount++;
            textView.setText("Clicked " + clickCount + " time" + ( clickCount != 1 ? "s" : "" ));
        }
    }
}
