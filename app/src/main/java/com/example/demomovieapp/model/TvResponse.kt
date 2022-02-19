package com.example.demomovieapp.model

data class TvResponse(
    val data: List<Tv>,
    val total_pages: Int,
    val total_items: Int,
    val current_page: Int
)