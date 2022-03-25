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
    Button button_name = new Button(this);
    button_name.setHint(“Log In”);
    linearLayout.addView(button_name);
}