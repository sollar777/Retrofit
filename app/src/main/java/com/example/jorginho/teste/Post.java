package com.example.jorginho.teste;

import com.google.gson.annotations.SerializedName;

public class Post {

    private Integer id;
    private int userId;
    private String title;

    @SerializedName("body")
    private String text;

    public Integer getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}

