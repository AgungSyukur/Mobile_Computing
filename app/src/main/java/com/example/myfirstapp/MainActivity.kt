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
    EditText edittext_name = new EditText(this);
    edittext_name.setHint(“Username”);
    linearLayout.addView(edittext_name);
}