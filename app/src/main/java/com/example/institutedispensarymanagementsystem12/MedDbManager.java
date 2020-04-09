package com.example.institutedispensarymanagementsystem12;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class MedDbManager extends SQLiteOpenHelper
{ private static final String dbname="med.db";
  public static  final String table="med_dis";
    public static  final String Col="Name";
    //String medname="140";


    public MedDbManager(@Nullable Context context)
    {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry="CREATE TABLE "+table+"(Name text primary key,Supplier text,Date_Of_Manufacture text,Date_Of_Expiry text,Price text,Active_Chemical text,Composition text,Stock text)";
        db.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Dbname");
        onCreate(db);


    }
    public String addRecord(String n,String supp,String dom,String doe,String p,String ac,String com,String sto) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("Name",n);
        cv.put("Supplier",supp);
        cv.put("Date_Of_Manufacture",dom);
        cv.put("Date_Of_Expiry",doe);
        cv.put("Price",p);
        cv.put("Active_Chemical", ac);
        cv.put("Composition",com);
        cv.put("Stock",sto);
       long res= db.insert("med_dis",null,cv);
        //DisplayDatabase();
       if(res==-1)
           return"Failed";
       else
           return"Successfully inserted";



    }
    public void deleteRecordbut(String m)
    {
        SQLiteDatabase dbd = this.getWritableDatabase();
        String query= String.format("DELETE FROM %s WHERE %s = \"%s\"",table,Col,m);
        dbd.execSQL(query);
        //DisplayDatabase();

    }
    public void updateEntry(String m1,String m2,String m3)
    {
    SQLiteDatabase dbu = this.getWritableDatabase();
Log.i("ooooo",m1);
        Log.i("ooooo",m2);

        Log.i("ooooo",m3);

    //String que= String.format("UPDATE %S SET %S = %S WHERE %S = \"%S\"",table,m2,m3,Col,m1);
    //dbu.execSQL(que);
        String p=String.format("UPDATE %s SET %s = \"%s\" WHERE %s = \"%s\"",table,m2,m3,Col,m1);

        dbu.execSQL(p);
        //DisplayDatabase();
    }
    public String DisplayDatabase()
    { String dbstring="";
    SQLiteDatabase dbdd = this.getWritableDatabase();
    String quer ="Select * from med_dis";
    Cursor c=dbdd.rawQuery(quer,null);
    c.moveToFirst();
    while(!c.isAfterLast())
    {if(c.getString(c.getColumnIndex("Name"))!=null)
    {dbstring+=c.getString(c.getColumnIndex("Name"));
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
        String quer ="Select * from med_dis";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("Supplier"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("Supplier"));
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
        String quer ="Select * from med_dis";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("Date_Of_Manufacture"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("Date_Of_Manufacture"));
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
        String quer ="Select * from med_dis";
       Cursor c=dbdd.rawQuery(quer,null);
       c.moveToFirst();
      while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("Date_Of_Expiry"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("Date_Of_Expiry"));
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
       String quer ="Select * from med_dis";
       Cursor c=dbdd.rawQuery(quer,null);
       c.moveToFirst();
        while(!c.isAfterLast())
       {if(c.getString(c.getColumnIndex("Price"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("Price"));
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
       String quer ="Select * from med_dis";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
       while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("Active_Chemical"))!=null)
       {dbstring+=c.getString(c.getColumnIndex("Active_Chemical"));
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
        String quer ="Select * from med_dis";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("Composition"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("Composition"));
            dbstring+="\n";
      }
            c.moveToNext();
        }
        dbdd.close();
        return dbstring;
}
   public String DisplayDatabase7()
   { String dbstring="";
        SQLiteDatabase dbdd = this.getWritableDatabase();
        String quer ="Select * from med_dis";
        Cursor c=dbdd.rawQuery(quer,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {if(c.getString(c.getColumnIndex("Stock"))!=null)
        {dbstring+=c.getString(c.getColumnIndex("Stock"));
            dbstring+="\n";
       }
           c.moveToNext();
        }
        dbdd.close();
        return dbstring;
}
}
