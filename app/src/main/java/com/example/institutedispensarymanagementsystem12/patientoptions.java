package com.example.institutedispensarymanagementsystem12;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class patientoptions extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientoptions);
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
        Intent add=new Intent(this,addnewpatient.class);
        startActivity(add);

    }

    public void viewDbPatient(View view) {Intent datababy=new Intent(this,patientdatabasePrint.class);
        startActivity(datababy);
    }


    public void deletionFunc(View view) {Intent del=new Intent(this,deleteoldpatient.class);
        startActivity(del);


    }

    public void updatefunc(View view) {
        Intent upd = new Intent(this, updatePatient.class);
        startActivity(upd);
    }
}
