package com.example.institutedispensarymanagementsystem12;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class medicineoptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicineoptions);
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

    public void additionfunc(View view)
    {
        Intent add=new Intent(this,addnewmedicine.class);
        startActivity(add);

    }

    public void viewDbMed(View view) {Intent datababy=new Intent(this,databasePrint.class);
        startActivity(datababy);
    }


    public void deletionFunc(View view) {Intent del=new Intent(this,deleteoldmedicine.class);
        startActivity(del);


    }
    public void updatefunc(View view)
    {
        Intent upd=new Intent(this,updateMedicine.class);
        startActivity(upd);
    }
    }

