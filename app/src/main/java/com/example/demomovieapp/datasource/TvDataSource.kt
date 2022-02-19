package com.example.demomovieapp.datasource

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.demomovieapp.model.Tv
import com.example.demomovieapp.network.ApiClient

class TvDataSource(private val apiClient: ApiClient): PagingSource<Int, Tv>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Tv> {
        val page = params.key?: 1

        return try {
            val response = apiClient.getTvList(page)
            val result = response?.data

            Log.d("bloodsoul", "PagingSource load: $page ${response.data.size}")
            LoadResult.Page(
                data = result.orEmpty(),
                prevKey = null,
                nextKey = if (page < response.total_pages) page + 1 else null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Tv>): Int? {
        TODO("Not yet implemented")
    }
}