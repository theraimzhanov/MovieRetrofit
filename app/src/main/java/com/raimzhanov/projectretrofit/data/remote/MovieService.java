package com.raimzhanov.projectretrofit.data.remote;

import com.raimzhanov.projectretrofit.domain.MovieItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieService {

    @GET("/films")
    Call<List<MovieItem>>getAllMovies();

}
