package com.mitz.viewspart2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
//    private TextView textView;
//    private Button button;
    private int clickCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.activity_main_textView);
        Button button = (Button) findViewById(R.id.activity_main_button);

//        button.setOnClickListener(this);
//        button.setOnClickListener(new ButtonClickHandler());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount++;
                textView.setText("Clicked " + clickCount + " time" + ( clickCount != 1 ? "s" : "" ));
            }
        });
    }

//    public void onClick(View view) {
//            clickCount++;
//            textView.setText("Clicked " + clickCount + " time" + ( clickCount != 1 ? "s" : "" ));
//        }

//    private class ButtonClickHandler implements View.OnClickListener {
//        public void onClick(View view) {
//            clickCount++;
//            textView.setText("Clicked " + clickCount + " time" + ( clickCount != 1 ? "s" : "" ));
//        }
//    }
}
