package com.example.institutedispensarymanagementsystem12;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class deleteoldpatient extends AppCompatActivity {

    EditText t1;
    String err= "Error!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //
        setContentView(R.layout.activity_deleteoldpatient);
        t1=findViewById(R.id.Student_IDdel);
        //Log.i(err,t1.getText().toString());
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


    public void deletePatientRecord(View view)
    {    String Student_IDdel =t1.getText().toString();
        PatientDbManager db=new PatientDbManager(this,null,null,1);
        db.deletePatientRecord(Student_IDdel);
        Toast.makeText(this,"Patient Record deleted successfully",Toast.LENGTH_LONG).show();
        t1.setText("");
    }

}
