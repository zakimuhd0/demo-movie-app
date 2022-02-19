package com.example.demomovieapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.demomovieapp.datasource.TvDataSource
import com.example.demomovieapp.network.ApiClient

class TvListViewModel(private val apiClient: ApiClient): ViewModel() {

    val listTv = Pager(PagingConfig(pageSize = 10)) {
        TvDataSource(apiClient)
    }.flow.cachedIn(viewModelScope)
}