package com.raimzhanov.projectretrofit.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MovieRetrofitBuilder {

      private static MovieService service;

      public static MovieService getService(){
              if (service == null){
                    service = buildRetrofit();
              }
              return service;
      }

    private static MovieService buildRetrofit(){
        return new Retrofit.Builder().baseUrl("https://ghibliapi.herokuapp.com").
                addConverterFactory(GsonConverterFactory.create()).build().create(MovieService.class);
    }
}
