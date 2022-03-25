package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    setContentView(R.layout.activity_main);
    LinearLayout linearlayout_name = (LinearLayout)findViewById(R.id.LinearLayout);
    TextView textview_name = new TextView(this);
    textveiw_name.setText(“Hello I am Text View”);
    linearLayout.addView(textview_name);
}