package com.example.prueba;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/personajes")
    Call<List<Post>> getPost();


}
