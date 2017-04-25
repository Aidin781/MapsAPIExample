package com.example.alexwalker.mapsapiexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FlatActivity extends AppCompatActivity {

    TextView titleTextView;
    TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat);

        titleTextView = (TextView)findViewById(R.id.titleTextView);
        descriptionTextView = (TextView)findViewById(R.id.descriptionTextView);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        titleTextView.setText(title);
        descriptionTextView.setText(description);
    }
}
