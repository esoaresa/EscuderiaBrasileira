package com.example.rm31374.escuderiabrasileira.api;

import com.example.rm31374.escuderiabrasileira.model.Time;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by rm31374 on 28/11/2016.
 */
public interface TimeAPI {

    @GET("/v2/{tipo}")
    Call<List<Time>> findBy(@Path("tipo") String tipo);

}