package com.example.institutedispensarymanagementsystem12;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class PatientDbManager extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME="Patient.db";
    public static final String TABLE_NAME="patient_table";
    public static final String COL_1="STUDENT_ID";
    public static final String COL_2="NAME";
    public static final String COL_3="DATE_OF_BIRTH";
    public static final String COL_4="GENDER";
    public static final String COL_5="BLOOD_GROUP";
    public static final String COL_6="HOSTEL";
    public static final String COL_7="AILMENT";

    public PatientDbManager(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DATABASE_NAME, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String query="CREATE TABLE "+TABLE_NAME+"(STUDENT_ID text primary key, NAME text,DATE_OF_BIRTH text, GENDER text , BLOOD_GROUP text,HOSTEL text,AILMENT text)";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS TABLE_NAME");
        onCreate(db);
    }


    public String addPatientRecord(String stuId,String name,String dob,String gender,String bloodGrp,String hostel,String ailment)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();

        contentvalues.put(COL_1, stuId);
        contentvalues.put(COL_2, name);
        contentvalues.put(COL_3, dob);
        contentvalues.put(COL_4, gender);
        contentvalues.put(COL_5, bloodGrp);
        contentvalues.put(COL_6, hostel);
        contentvalues.put(COL_7, ailment);

        long result = db.insert(TABLE_NAME, null, contentvalues);
        //DisplayDatabase();
        if (result == -1)
            return "Failed";
        else
            return "Successfully inserted";
        }


    public void deletePatientRecord(String m)
    {
        SQLiteDatabase dbd = this.getWritableDatabase();
        String query= String.format("DELETE FROM %s WHERE %s = \"%s\"",TABLE_NAME,COL_1,m);
        dbd.execSQL(query);
        //DisplayDatabase();

    }
    public void updatePatientEntry(String m1,String m2,String m3)
    {
        SQLiteDatabase dbu = this.getWritableDatabase();
        Log.i("ooooo",m1);
        Log.i("ooooo",m2);

        Log.i("ooooo",m3);

        //String que= String.format("UPDATE %S SET %S = %S WHERE %S = \"%S\"",table,m2,m3,Col,m1);
        //dbu.execSQL(que);
        String p=String.format("UPDATE %s SET %s = \"%s\" WHERE %s = \"%s\"",TABLE_NAME,m2,m3,COL_1,m1);

        dbu.execSQL(p);
        //DisplayDatabase();
    }






    public String DisplayDatabase()
    { String dbstring="";
        SQLiteDatabase dbdd = this.getWritableDatabase();
        String quer ="Select * from patient_table";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("STUDENT_ID"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("STUDENT_ID"));
            dbstring+="\n";
        }
            c.moveToNext();
        }
        dbdd.close();
        return dbstring;



    }

    public String DisplayDatabase1()
    { String dbstring="";
        SQLiteDatabase dbdd = this.getWritableDatabase();
        String quer ="Select * from patient_table";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("NAME"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("NAME"));
            dbstring+="\n";
        }
            c.moveToNext();
        }
        dbdd.close();
        return dbstring;



    }
    public String DisplayDatabase2()
    { String dbstring="";
        SQLiteDatabase dbdd = this.getWritableDatabase();
        String quer ="Select * from patient_table";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("DATE_OF_BIRTH"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("DATE_OF_BIRTH"));
            dbstring+="\n";
        }
            c.moveToNext();
        }
        dbdd.close();
        return dbstring;



    }
    public String DisplayDatabase3()
    { String dbstring="";
        SQLiteDatabase dbdd = this.getWritableDatabase();
        String quer ="Select * from patient_table";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("GENDER"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("GENDER"));
            dbstring+="\n";
        }
            c.moveToNext();
        }
        dbdd.close();
        return dbstring;


    }

    public String DisplayDatabase4()
    { String dbstring="";
        SQLiteDatabase dbdd = this.getWritableDatabase();
        String quer ="Select * from patient_table";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("BLOOD_GROUP"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("BLOOD_GROUP"));
            dbstring+="\n";
        }
            c.moveToNext();
        }
        dbdd.close();

        return dbstring;



         }
    public String DisplayDatabase6()
    { String dbstring="";
        SQLiteDatabase dbdd = this.getWritableDatabase();
        String quer ="Select * from patient_table";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("HOSTEL"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("HOSTEL"));
            dbstring+="\n";
        }
            c.moveToNext();
        }
        dbdd.close();

        return dbstring;



    }

    public String DisplayDatabase5()
    { String dbstring="";
        SQLiteDatabase dbdd = this.getWritableDatabase();
        String quer ="Select * from patient_table";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("HOSTEL"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("HOSTEL"));
            dbstring+="\n";
        }
            c.moveToNext();
        }
        dbdd.close();

        return dbstring;



    }



    //viewAll Database
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " + TABLE_NAME,null);
        return res;
    }



    }
