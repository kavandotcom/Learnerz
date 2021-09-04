package com.example.learnerz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }


    public void NoobListener(View view) {
        Intent intent = new Intent(Level.this, Weeks.class);
        startActivity(intent);
    }

    public void midwayListener(View view) {
        Intent intent = new Intent(Level.this, Weeks.class);
        startActivity(intent);
    }

    public void proListener(View view) {
        Intent intent = new Intent(Level.this, Weeks.class);
        startActivity(intent);

    }
}