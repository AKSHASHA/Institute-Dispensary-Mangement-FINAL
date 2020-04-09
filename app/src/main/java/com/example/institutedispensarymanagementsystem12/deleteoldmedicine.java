package com.example.institutedispensarymanagementsystem12;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class deleteoldmedicine extends AppCompatActivity {
    EditText t1;
   String err= "Error!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //
        setContentView(R.layout.activity_deleteoldmedicine);
        t1=findViewById(R.id.medNamedel);
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


    public void deleteRecordbut(View view)
    {    String namedel =t1.getText().toString();
         MedDbManager db=new MedDbManager(this);
         db.deleteRecordbut(namedel);
         Toast.makeText(this,"Deleted successfully",Toast.LENGTH_LONG).show();
         t1.setText("");
}
}
