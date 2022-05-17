package com.raimzhanov.projectretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.raimzhanov.projectretrofit.data.remote.MovieRetrofitBuilder;
import com.raimzhanov.projectretrofit.domain.MovieItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MovieRetrofitBuilder.getService().getAllMovies().enqueue(new Callback<List<MovieItem>>() {
            @Override
            public void onResponse(Call<List<MovieItem>> call, Response<List<MovieItem>> response) {

            }

            @Override
            public void onFailure(Call<List<MovieItem>> call, Throwable t) {

            }
        });
    }
}