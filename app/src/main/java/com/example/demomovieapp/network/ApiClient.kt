package com.example.demomovieapp.network

import com.example.demomovieapp.model.TvResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    private val BASE_URL = "http://42.191.129.121/api/v1/"

    private var apiService: ApiService = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
        .create(ApiService::class.java)

//    suspend fun getTvByGenre(page: Int): TvResponse {
//        return apiService.getTvByGenre(page)
//    }
//
    suspend fun getTvList(page: Int): TvResponse {
        return apiService.getTvList(page)
    }

    suspend fun getTvByGenre(page: Int, genre: Int): TvResponse {
        return apiService.getTvByGenre(page, genre)
    }
//
//    fun getTvById(tvId: Int): Single<Tv> {
//        return apiService.getTvById(tvId)
//    }
//
//    fun getAllEpisode(tvId: Int, seasonId: Int): Single<Episode> {
//        return apiService.getAllEpisode(tvId, seasonId)
//    }
}