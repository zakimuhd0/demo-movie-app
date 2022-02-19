package com.example.demomovieapp.view.view.activity

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demomovieapp.R
import com.example.demomovieapp.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        recyclerView = findViewById(R.id.recyclerview)
//
//        linearLayoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = linearLayoutManager
//
//        val call: Call<List<Movie>> = ApiClient().getAllMovie()
//        call.enqueue(object: Callback<List<Movie>> {
//            override fun onResponse(call: Call<List<Movie>>?, response: Response<List<Movie>>?) {
//                adapter = MovieListAdapter(response!!.body()!!, baseContext)
//                adapter.notifyDataSetChanged()
//                recyclerView.adapter = adapter
//                Log.d(TAG, "onResponse: " + response!!.body()!!)
//            }
//
//            override fun onFailure(call: Call<List<Movie>>?, t: Throwable?) {
//                TODO("Not yet implemented")
//            }
//        })
    }
}