package com.example.demomovieapp.model

import com.google.gson.annotations.SerializedName

data class Tv(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("poster_path")
    val poster_path: String?,
    @SerializedName("tv_genre_ids")
    val tv_genre_ids: List<Genre>,
    @SerializedName("tv_country_ids")
    val tv_country_ids: List<Country>
)
