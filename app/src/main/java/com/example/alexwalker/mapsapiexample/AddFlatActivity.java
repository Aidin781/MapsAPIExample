package com.example.alexwalker.mapsapiexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddFlatActivity extends AppCompatActivity {

    private EditText latEditText;
    private EditText lngEditText;
    private EditText titleEditText;
    private EditText descriptionEditText;
    private Button saveButton;
    private Flat flat;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_flat);

        latEditText = (EditText) findViewById(R.id.latEditText);
        lngEditText = (EditText) findViewById(R.id.lngEditText);
        titleEditText = (EditText) findViewById(R.id.titleEditText);
        descriptionEditText = (EditText) findViewById(R.id.descriptionEditText);
        saveButton = (Button) findViewById(R.id.saveButton);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Flats");

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flat = new Flat();
                flat.setLat(latEditText.getText().toString());
                flat.setLng(lngEditText.getText().toString());
                flat.setTitle(titleEditText.getText().toString());
                flat.setDescription(descriptionEditText.getText().toString());

                databaseReference.push().setValue(flat);
            }
        });


    }
}
