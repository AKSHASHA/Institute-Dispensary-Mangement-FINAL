package com.example.institutedispensarymanagementsystem12;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class addnewmedicine extends AppCompatActivity {

    EditText medName,dom,doe,price,activechem,supName,composition,stock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewmedicine);
         medName=findViewById(R.id.medName);
         dom=findViewById(R.id.dom);
         doe=findViewById(R.id.doe);
         price=findViewById(R.id.price);
         activechem=findViewById(R.id.activechem);
         supName=findViewById(R.id.supName);
         composition=findViewById(R.id.composition);
         stock=findViewById(R.id.stock);
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


    public void addRecord(View view) {
        MedDbManager db=new MedDbManager(this);
        String res=db.addRecord(medName.getText().toString(),supName.getText().toString(),dom.getText().toString(),doe.getText().toString(),price.getText().toString(),activechem.getText().toString(),composition.getText().toString(),stock.getText().toString());
        Toast.makeText(this,res,Toast.LENGTH_LONG).show();
        medName.setText("");
        supName.setText("");
        dom.setText("");
        doe.setText("");
        price.setText("");
        activechem.setText("");
        composition.setText("");
        stock.setText("");


    }

}
