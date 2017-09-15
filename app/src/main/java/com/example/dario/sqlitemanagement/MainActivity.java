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

//        insertDatos(MDB);

//        showDatos(MDB);

//        deleteDatos(MDB);

//        insertDatosCrazy(MDB, num);

//        showDatosCrazy(MDB, num);

    }

    public void insertDatos(MiBaseDatos MDB){
        MDB.insertUser(1, "Pedro", 111111111, "pedro@DB.es");
        MDB.insertUser(2, "Sandra", 222222222, "sandra@DB.es");
        MDB.insertUser(3, "Maria", 333333333, "maria@DB.es");
        MDB.insertUser(4, "Daniel", 444444444, "daniel@DB.es");
        MDB.insertUser(5, "Dario", 444444444, "daniel@DB.es");
        MDB.insertUser(6, "Manuel", 444444444, "daniel@DB.es");
        MDB.insertUser(7, "Jose", 444444444, "daniel@DB.es");
        MDB.insertUser(8, "Mario", 444444444, "daniel@DB.es");

        MDB.insertUser(9, "Ramiro", 111111111, "pedro@DB.es");
        MDB.insertUser(10, "Luisa", 222222222, "sandra@DB.es");
        MDB.insertUser(11, "Pedro", 333333333, "maria@DB.es");
        MDB.insertUser(12, "Jose", 444444444, "daniel@DB.es");
        MDB.insertUser(13, "Pepo", 444444444, "daniel@DB.es");
        MDB.insertUser(14, "Mauricio", 444444444, "daniel@DB.es");
        MDB.insertUser(15, "Melina", 444444444, "daniel@DB.es");
        MDB.insertUser(16, "Marito G", 444444444, "daniel@DB.es");

        MDB.insertUser(17, "Juan", 111111111, "pedro@DB.es");
        MDB.insertUser(18, "Andres", 222222222, "sandra@DB.es");
        MDB.insertUser(19, "Mauro", 333333333, "maria@DB.es");
        MDB.insertUser(20, "Walter", 444444444, "daniel@DB.es");
        MDB.insertUser(21, "Hernesto", 444444444, "daniel@DB.es");
        MDB.insertUser(22, "Juarez", 444444444, "daniel@DB.es");
        MDB.insertUser(23, "Cavenagui", 444444444, "daniel@DB.es");
        MDB.insertUser(24, "Tevez", 444444444, "daniel@DB.es");
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
