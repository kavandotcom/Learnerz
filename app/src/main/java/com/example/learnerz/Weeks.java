package com.example.learnerz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.widget.TextView;

public class Weeks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeks);

        Intent intent = getIntent();
        String heading_for_weeks;
        TextView HeadingForWeeks = (TextView) findViewById(R.id.heading_for_week_id);
        heading_for_weeks = intent.getStringExtra("heading_for_weeks");

        HeadingForWeeks.setText(heading_for_weeks);


        TextView link1 = (TextView) findViewById(R.id.link1);
        link1.setText(getText(R.string.Id1noobweek1));
        link1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link2 = (TextView) findViewById(R.id.link2);
        link2.setText(getText(R.string.Id1noobweek2));
        link2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link3 = (TextView) findViewById(R.id.link3);
        link3.setText(getText(R.string.Id1noobweek3));
        link3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link4 = (TextView) findViewById(R.id.project_links);
        link4.setText(getText(R.string.Id1noobproject));
        link4.setMovementMethod(LinkMovementMethod.getInstance());


    }
}