package com.example.dario.sqlitemanagement;

/**
 * Created by dario on 14/9/17.
 */

public class Word {

    private int id;
    private String word;


    // Constructor de un objeto Word
    public Word(int id, String word) {
        this.id = id;
        this.word = word;
    }

    // Recuperar/establecer Id unico de Palabra
    public int getIdWord() {

        return id;
    }
    public void setIdWord(int id) {

        this.id = id;
    }

    // Recuperar/establecer Palabra
    public String getWord() {

        return word;
    }
    public void setWord(String word) {

        this.word = word;
    }

}
