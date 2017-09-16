package com.example.dario.sqlitemanagement;

/**
 * Created by dario on 14/9/17.
 */

public class User {

    private int id;
    private String name;
    private int phone;
    private String email;

    // Constructor de un objeto User
    public User(int id, String name, int phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Recuperar/establecer ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Recuperar/establecer NOMBRE
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Recuperar/establecer TELEFONO
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    // Recuperar/establecer EMAIL
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
