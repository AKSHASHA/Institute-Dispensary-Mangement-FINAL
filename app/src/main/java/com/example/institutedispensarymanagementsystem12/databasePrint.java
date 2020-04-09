package com.example.institutedispensarymanagementsystem12;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class databasePrint extends AppCompatActivity {
    TextView naamkaran,n2,n3,n4,n5,n6,n7,n8;
    //databasePrint obj=new databasePrint();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_print);
        naamkaran=findViewById(R.id.naamkaran);
        n2=findViewById(R.id.naamkaran12); naamkaran=findViewById(R.id.naamkaran);
        n3=findViewById(R.id.naamkaran13);
        n4=findViewById(R.id.naamkaran14);
        n5=findViewById(R.id.naamkaran15);
        n6=findViewById(R.id.naamkaran16);
        n7=findViewById(R.id.naamkaran17);
        n8=findViewById(R.id.naamkaran18);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //obj.DisplayDatabase();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

public void DisplayDatabase(View view)
    {MedDbManager db=new MedDbManager(this);
        String res=db.DisplayDatabase();
        naamkaran.setText(res);

        String res2=db.DisplayDatabase1();
        n2.setText(res2);

        String res3=db.DisplayDatabase2();
        n3.setText(res3);

        String res4=db.DisplayDatabase3();
    n4.setText(res4);

      String res5=db.DisplayDatabase4();
       n5.setText(res5);

       String res6=db.DisplayDatabase5();
        n6.setText(res6);

        String res7=db.DisplayDatabase6();
       n7.setText(res7);

       String res8=db.DisplayDatabase7();
        n8.setText(res8);








    }



}
