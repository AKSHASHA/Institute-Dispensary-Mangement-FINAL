package com.example.institutedispensarymanagementsystem12;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class addnewpatient extends AppCompatActivity {

    EditText stuId,name,dob,gender,bloodGrp,hostel,ailment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewpatient);
        stuId=findViewById(R.id.stuId);
        name=findViewById(R.id.name);
        dob=findViewById(R.id.dob);
        gender=findViewById(R.id.gender);
        bloodGrp=findViewById(R.id.bloodGrp);
        hostel=findViewById(R.id.dob5);
        ailment=findViewById(R.id.dob4);
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


    public void addPatientRecord(View view) {
        PatientDbManager db= new PatientDbManager(this , null, null,1);
        String res=db.addPatientRecord(stuId.getText().toString(),name.getText().toString(),dob.getText().toString(),gender.getText().toString(),bloodGrp.getText().toString(),hostel.getText().toString(),ailment.getText().toString());
        Toast.makeText(this,res,Toast.LENGTH_LONG).show();
        stuId.setText("");
        name.setText("");
        dob.setText("");
        gender.setText("");
        bloodGrp.setText("");
        ailment.setText("");
        hostel.setText("");


    }


}
