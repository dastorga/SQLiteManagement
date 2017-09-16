package com.example.dario.sqlitemanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int num = 12;
        MiBaseDatos MDB = new MiBaseDatos(getApplicationContext());

//        insertDatos(MDB,500,"Pedro", 505050, "pedro@gmail.com");

//        showDatos(MDB);

//        deleteDatos(MDB);

//        insertDatosCrazy(MDB, num);

//        showDatosCrazy(MDB, num);

    }

    public void insertDatos(MiBaseDatos MDB, int id, String name, int phone, String email ){
        MDB.insertUser(id, name, phone, email);
        Toast.makeText(getApplicationContext(), "END INSERT" , Toast.LENGTH_SHORT).show();
    }

    public void showDatos(MiBaseDatos MDB){
        for (int i = 0; i < MDB.recoverUsers().size(); i++) {
            String name = MDB.recoverUsers().get(i).getName();
            Toast.makeText(getApplicationContext(), name , Toast.LENGTH_SHORT).show();
        }
    }

    public void deleteDatos(MiBaseDatos MDB){
        for (int i = 0; i < MDB.recoverUsers().size(); i++) {
            MDB.deleteUser(i);
        }
        Toast.makeText(getApplicationContext(), "END" , Toast.LENGTH_SHORT).show();
    }

    public void insertDatosCrazy(MiBaseDatos MDB, int num){
        for (int i = 0; i < num; i++) {
            MDB.insertUser(i,"Crazy",i,"crazy@crazy.com");
        }
        Toast.makeText(getApplicationContext(), "END CRAZY" , Toast.LENGTH_SHORT).show();
    }

    public void showDatosCrazy(MiBaseDatos MDB, int num){
        for (int i = 0; i < num; i++) {
            Toast.makeText(getApplicationContext(), i + " "+MDB.recoverUsers().get(i).getName() , Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(getApplicationContext(), "END SHOW CRAZY" , Toast.LENGTH_SHORT).show();
    }

}
