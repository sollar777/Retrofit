package com.example.jorginho.teste;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;

public interface JsonApiResponse {

    @GET("posts")
    Call<List<Post>> getPost();

}
