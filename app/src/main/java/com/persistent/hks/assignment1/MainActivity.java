package com.persistent.hks.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewDisplayMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDisplayMessage = (TextView) findViewById(R.id.textView_displayMessage);
        String username = getIntent().getStringExtra("username");
        textViewDisplayMessage.setText("Welcome " + username + "!");
    }
}