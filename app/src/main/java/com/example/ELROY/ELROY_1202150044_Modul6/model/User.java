package com.example.ELROY.ELROY_1202150044_Modul6.model;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class User {

    public String username;

    public String email;



    public User() {

        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }



    public User(String username, String email) {

        this.username = username;

        this.email = email;

    }
}
