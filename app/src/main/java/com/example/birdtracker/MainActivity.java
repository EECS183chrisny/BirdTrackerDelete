package com.example.birdtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextBirdName, editTextZipcode, editTextPname;
    Button buttonSubmit, buttonGoToSearch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBirdName.findViewById(R.id.editTextBirdName);
        editTextZipcode.findViewById(R.id.editTextZipCode);
        editTextPname.findViewById(R.id.editTextPName);

        buttonSubmit.findViewById(R.id.buttonSubmit);
        buttonGoToSearch.findViewById(R.id.buttonGoToSearch);




    }

    @Override
    public void onClick(View view) {

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

        if (view == buttonSubmit){
            String birdName = editTextBirdName.getText().toString()
            String personName = editTextPname.getText(),toString();
            int zipCode = Integer.parseInt(editTextZipcode.getText().toString());

        }



    }

    private void makeNewUsers(String toString, String toString1, EditText editTextPname) {
    }
}
