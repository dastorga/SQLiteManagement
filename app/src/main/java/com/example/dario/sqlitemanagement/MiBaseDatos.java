package com.example.dario.sqlitemanagement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dario on 14/9/17.
 */

public class MiBaseDatos extends SQLiteOpenHelper {

    private static final int VERSION_BASEDATOS = 1;

    // Nombre de nuestro archivo de base de datos
    private static final String NOMBRE_BASEDATOS = "mibasedatos.db";

    // Sentencia SQL para la creación de tabla usuario
    private static final String TABLA_USER = "CREATE TABLE USER" + "(_id INT PRIMARY KEY, name TEXT, phone INT, email TEXT)";

    // Sentencia SQL para la creación de tabla palabra
    private static final String TABLA_WORD = "CREATE TABLE WORD" + "(_id INT PRIMARY KEY, word VARCHAR)";

    // CONSTRUCTOR de la clase
    public MiBaseDatos(Context context) {
        super(context, NOMBRE_BASEDATOS, null, VERSION_BASEDATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLA_USER);
        db.execSQL(TABLA_WORD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_USER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_WORD);
        onCreate(db);
    }


    public void insertUser(int id, String name, int phone, String email) {
        SQLiteDatabase db = getWritableDatabase();
        if(db != null){
            ContentValues valores = new ContentValues();

            valores.put("_id", id);
            valores.put("name", name);
            valores.put("phone", phone);
            valores.put("email", email);

            db.insert("USER", null, valores);
            db.close();
        }
    }

    public void insertWord(int id, String word) {
        SQLiteDatabase db = getWritableDatabase();
        if(db != null){
            ContentValues valores = new ContentValues();

            valores.put("_id", id);
            valores.put("word", word);

            db.insert("WORD", null, valores);
            db.close();
        }
    }

    public void updateUser(int id, String name, int phone, String email){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues valores = new ContentValues();

        valores.put("_id", id);
        valores.put("name", name);
        valores.put("phone", phone);
        valores.put("email", email);

        db.update("USER", valores, "_id=" + id, null);
        db.close();
    }

    public void updateWord(int id, String word){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues valores = new ContentValues();

        valores.put("_id", id);
        valores.put("word", word);

        db.update("WORD", valores, "_id=" + id, null);
        db.close();
    }

    public void deleteUser(int id) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete("USER", "_id="+id, null);
        db.close();
    }

    public void deleteWord(int id) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete("WORD", "_id="+id, null);
        db.close();
    }

    public User recoverUser(int id) {
        SQLiteDatabase db = getReadableDatabase();
        String[] valores_recuperar = {"_id", "name", "phone", "email"};
        Cursor c = db.query("USER", valores_recuperar, "_id=" + id, null, null, null, null, null);
        if(c != null) {
            c.moveToFirst();
        }
        User user = new User(c.getInt(0), c.getString(1), c.getInt(2), c.getString(3));
        db.close();
        c.close();
        return user;
    }

    public List<User> recoverUsers() {
        SQLiteDatabase db = getReadableDatabase();
        List<User> lista_users = new ArrayList<User>();
        String[] valores_recuperar = {"_id", "name", "phone", "email"};
        Cursor c = db.query("USER", valores_recuperar, null, null, null, null, null, null);
        c.moveToFirst();
        do {
            User user = new User(c.getInt(0), c.getString(1), c.getInt(2), c.getString(3));
            lista_users.add(user);
        } while (c.moveToNext());
        db.close();
        c.close();
        return lista_users;
    }

    public List<Word> recoverWords() {
        SQLiteDatabase db = getReadableDatabase();
        List<Word> lista_words = new ArrayList<Word>();
        String[] valores_recuperar = {"_id", "word"};
        Cursor c = db.query("WORD", valores_recuperar, null, null, null, null, null, null);
        c.moveToFirst();
        do {
            Word word = new Word(c.getInt(0), c.getString(1));
            lista_words.add(word);
        } while (c.moveToNext());
        db.close();
        c.close();
        return lista_words;
    }

    // Elimina la tabla que se pasa como parametro
    public void dropTable(String table) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + table);
        db.close();
    }


}
