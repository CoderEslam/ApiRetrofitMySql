package com.doubleclick.apiretrofitmysql;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created By Eslam Ghazy on 3/19/2022
 */
public class ApiClient {

    // password =>  01221930858@Eslam
    //database  username => notesApp
    // database name  => notes
    private static final String BASE_URL = "https://eslamghazy600.000webhostapp.com/";
    private static Retrofit retrofit;

    public static Retrofit getApiClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
