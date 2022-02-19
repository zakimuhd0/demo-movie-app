package com.example.demomovieapp.view.view.fragment.tv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demomovieapp.databinding.FragmentTvMenuBinding
import com.example.demomovieapp.network.ApiClient
import com.example.demomovieapp.view.adapter.TvListAdapter
import com.example.demomovieapp.viewmodel.TvListViewModel
import com.example.demomovieapp.viewmodel.TvListViewModelFactory
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TvMenuFragment : Fragment() {

    private var _binding: FragmentTvMenuBinding? = null
    private val binding get() = _binding!!

    private lateinit var tvListAdapter: TvListAdapter
    private lateinit var tvListViewModel: TvListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTvMenuBinding.inflate(inflater, container, false)
        val view = binding.root

        tvListAdapter = TvListAdapter()

        binding.airedRecentList.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            adapter = tvListAdapter
        }

        tvListViewModel =
            ViewModelProvider(
                this,
                TvListViewModelFactory(ApiClient())
            )[TvListViewModel::class.java]

        observerViewModel()

        return view
    }

    private fun observerViewModel() {
        lifecycleScope.launch {
            tvListViewModel.listTv.collect {
                tvListAdapter.submitData(it)
            }
        }
    }
}