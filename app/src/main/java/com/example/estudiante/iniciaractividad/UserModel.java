package com.example.estudiante.iniciaractividad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UserModel {

    private String name;
    private String email;
    private String username;

    public UserModel(String name) {
        this.name = name;
        this.email =email;
        this.username= username;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
