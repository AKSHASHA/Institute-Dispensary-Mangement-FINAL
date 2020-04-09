package com.example.institutedispensarymanagementsystem12;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.app.Activity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class patientdatabasePrint extends AppCompatActivity {

    TextView p1,p2,p3,p4,p5,p6,p7,btnViewAll;
    //databasePrint obj=new databasePrint();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientdatabase_print);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        p3=findViewById(R.id.p3);
        p4=findViewById(R.id.p4);
        p5=findViewById(R.id.p5);
        p6=findViewById(R.id.p6);
        p7=findViewById(R.id.p7);

        btnViewAll=(Button)findViewById(R.id.button4);
        viewAll();

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




    public void DisplayPatientDatabase(View view)
    {
        PatientDbManager db = new PatientDbManager(this,null, null,1);
        String res=db.DisplayDatabase();
        p1.setText(res);

        String res2=db.DisplayDatabase1();
        p2.setText(res2);

        String res3=db.DisplayDatabase2();
        p3.setText(res3);

        String res4=db.DisplayDatabase3();
        p4.setText(res4);

        String res5=db.DisplayDatabase4();
        p5.setText(res5);


        String res6=db.DisplayDatabase5();
        p6.setText(res6);

        String res7=db.DisplayDatabase6();
        p7.setText(res7
        );
    }



    //viewAll Database
    public void viewAll(){
        final PatientDbManager db = new PatientDbManager(this,null,null,1);
        btnViewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = db.getAllData();
                        if(res.getCount()==0){
                            //show message
                            showmessage("error","nothing found");
                            return;
                        }
                        StringBuffer buffer= new StringBuffer();
                        while(res.moveToNext()){
                            buffer.append("STUDENT_ID:"+res.getString(0)+"\n");
                            buffer.append("NAME:"+res.getString(1)+"\n");
                            buffer.append("DATE_OF_BIRTH:"+res.getString(2)+"\n");
                            buffer.append("GENDER:"+res.getString(3)+"\n");
                            buffer.append("BLOOD_GROUP:"+res.getString(4)+"\n");
                            buffer.append("HOSTEL:"+res.getString(5)+"\n");
                            buffer.append("AILMENT:"+res.getString(6)+"\n\n");
                        }
                        showmessage("Data",buffer.toString());
                    }
                }
        );
    }

    public void showmessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }





}
