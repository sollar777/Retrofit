package com.example.jorginho.teste;

import com.google.gson.annotations.SerializedName;

public class Comment {

    private Integer id;
    private int userId;
    private String email;

    @SerializedName("body")
    private String text;

    public Integer getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }
}
