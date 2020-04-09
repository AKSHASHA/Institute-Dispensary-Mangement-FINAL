package com.example.institutedispensarymanagementsystem12;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class updateMedicine extends AppCompatActivity {
    EditText tt1,tt2,tt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_medicine);
        tt1=findViewById(R.id.naam);
        tt2=findViewById(R.id.field);
        tt3=findViewById(R.id.naya);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void updateEntry(View view){
        String a=tt1.getText().toString();
        String b=tt2.getText().toString();
        String c=tt3.getText().toString();

        MedDbManager dbud=new MedDbManager(this);
        dbud.updateEntry(a,b,c);
        Toast.makeText(this,"Successfully Updated",Toast.LENGTH_LONG).show();
        tt1.setText("");
        tt2.setText("");
        tt3.setText("");
    }
}
