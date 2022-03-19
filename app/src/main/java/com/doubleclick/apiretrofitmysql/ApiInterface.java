package com.doubleclick.apiretrofitmysql;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created By Eslam Ghazy on 3/19/2022
 */
public interface ApiInterface {

    @FormUrlEncoded
    @POST("index.php")
    Call<Note> saveNote(
            @Field("title") String title,
            @Field("note") String note,
            @Field("color") int color
    );

    @GET("notes.php")
    Call<List<Note>> getNotes();

    @FormUrlEncoded
    @POST("update.php")
    Call<Note> updateNote(
            @Field("id") int id,
            @Field("title") String title,
            @Field("note") String note,
            @Field("color") int color
    );

    @FormUrlEncoded
    @POST("delete.php")
    Call<Note> deleteNote(@Field("id") int id);

}
