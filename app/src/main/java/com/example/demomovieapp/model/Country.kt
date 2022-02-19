package com.example.demomovieapp.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?
)