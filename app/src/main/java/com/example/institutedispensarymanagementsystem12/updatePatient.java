package com.example.institutedispensarymanagementsystem12;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class updatePatient extends AppCompatActivity {

    EditText tt1,tt2,tt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_patient);
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

    public void updatePatientEntry(View view){
        String a=tt1.getText().toString();
        String b=tt2.getText().toString();
        String c=tt3.getText().toString();

        PatientDbManager dbu=new PatientDbManager(this,null,null,1);
        dbu.updatePatientEntry(a,b,c);
        Toast.makeText(this,"Successfully Updated",Toast.LENGTH_LONG).show();
        tt1.setText("");
        tt2.setText("");
        tt3.setText("");
    }

}
