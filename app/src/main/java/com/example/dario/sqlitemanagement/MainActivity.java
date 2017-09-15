package com.example.dario.sqlitemanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MiBaseDatos MDB = new MiBaseDatos(getApplicationContext());

        insertDatos(MDB);
        showDatos(MDB);
        deleteDatos(MDB);





//        Log.d("TOTAL", Integer.toString(MDB.recoverUsers().size()));
//
//        int[] ids = new int[MDB.recoverUsers().size()];
//
//        String[] names = new String[MDB.recoverUsers().size()];
//
//        int[] phones = new int[MDB.recoverUsers().size()];
//
//        String[] emails = new String[MDB.recoverUsers().size()];
//
//
//        for (int i = 0; i < MDB.recoverUsers().size(); i++) {
//
//            ids[i] = MDB.recoverUsers().get(i).getId();
//
//            names[i] = MDB.recoverUsers().get(i).getName();
//
//            phones[i] = MDB.recoverUsers().get(i).getPhone();
//
//            emails[i] = MDB.recoverUsers().get(i).getEmail();
//
//            Log.d(""+ids[i], names[i] + ", " + phones[i] + ", " + emails[i]);
//        }





//
//        for (int i = 0; i < MDB.recoverUsers().size(); i++) {
//
//            String s  = Integer.toString(MDB.recoverUsers().get(i).getId());
//            Toast.makeText(getApplicationContext(), s , Toast.LENGTH_SHORT).show();
//        }


//        MDB.dropTable("USER");
//        Integer.toString(MDB.recoverUsers().size());


//        Toast.makeText(getApplicationContext(), Integer.toString(MDB.recoverUsers().size()) , Toast.LENGTH_SHORT).show();



//        Log.d("Total de USERS", String.valueOf(MDB.recoverUsers().size()));


//        // Modificamos el registro 3
//        MDB.modificarCONTACTO(3, "PPPPP", 121212121, "xxxx@xxxx.es");
//
//        // Recuperamos el 3 registro y lo mostramos en el log
//        int id = MDB.recuperarCONTACTO(3).getID();
//        String nombre = MDB.recuperarCONTACTO(3).getNOMBRE();
//        int telefono = MDB.recuperarCONTACTO(3).getTELEFONO();
//        String email = MDB.recuperarCONTACTO(3).getEMAIL();
//        Log.d(""+id, nombre + ", " + telefono + ", " + email);
//
//        // Borramos el registro 3
//        MDB.borrarCONTACTO(3);
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

}
