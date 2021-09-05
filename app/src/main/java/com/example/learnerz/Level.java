package com.example.learnerz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level extends AppCompatActivity {

    String Id;
    String Heading_name_levels;
    TextView headingInLevels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        Intent intent = getIntent();
        Id = intent.getStringExtra("Id");
        Heading_name_levels = intent.getStringExtra("Heading_in_levels");

        headingInLevels = (TextView) findViewById(R.id.headingInLevels);
        headingInLevels.setText(Heading_name_levels);

    }


    public void NoobListener(View view) {
        Intent intent = new Intent(Level.this, Weeks.class);
        intent.putExtra("Id", Id);
        intent.putExtra("heading_for_weeks", Heading_name_levels);
        startActivity(intent);
    }

    public void midwayListener(View view) {
        Intent intent = new Intent(Level.this, Weeks.class);
        intent.putExtra("Id", Id);
        intent.putExtra("heading_for_weeks", Heading_name_levels);
        startActivity(intent);
    }

    public void proListener(View view) {
        Intent intent = new Intent(Level.this, Weeks.class);
        intent.putExtra("Id", Id);
        intent.putExtra("heading_for_weeks", Heading_name_levels);
        startActivity(intent);

    }
}