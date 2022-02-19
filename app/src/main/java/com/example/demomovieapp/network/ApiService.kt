package com.example.demomovieapp.network

import com.example.demomovieapp.model.TvResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("tv")
    suspend fun getTvList(@Query("page") page: Int): TvResponse

    @GET("tv")
    suspend fun getTvByGenre(@Query("page") page: Int, @Query("genre") genre: Int): TvResponse
//
//    @GET("tv")
//    fun getAllTv(): Single<TvResponse>
//
//    @GET("tv/{tvId}")
//    fun getTvById(@Path("tvId") tvId: Int): Single<Tv>
//
//    @GET("tv/{tvId}/season/{seasonId}/episode")
//    fun getAllEpisode(@Path("tvId") tvId: Int, @Path("seasonId") seasonId: Int): Single<Episode>
}