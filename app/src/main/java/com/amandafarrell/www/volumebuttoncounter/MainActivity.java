package com.amandafarrell.www.volumebuttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int number = 1;
    TextView number_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_textview = findViewById(R.id.number_textview);
    }

    public void increase(View view){
        number += 1;
        number_textview.setText(String.valueOf(number));
    }

    public void decrease(View view){
        number -= 1;
        number_textview.setText(String.valueOf(number));
    }

    //TODO save score between use
    //TODO reset score option
    //TODO Setting for default reset number
    //TODO Setting for score increment
    //TODO add vibration option for key press, default vibrate - requires permissions. Ask for permission only when option selected?
    //TODO remain in portrait mode
    //TODO remove ability to hold and keep increasing score
    //TODO toggle onscreen buttons visible or not
    //TODO Add buttons for different increment values
    //TODO ability to store multiple scores

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_VOLUME_UP)) {
            number += 1;
            number_textview.setText(String.valueOf(number));
        } else if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN){
            number -= 1;
            number_textview.setText(String.valueOf(number));
        }
        //return true so that it doesn't trigger normal volume button functionality
        return true;
    }
}
