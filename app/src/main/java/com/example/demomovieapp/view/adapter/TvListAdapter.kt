package com.example.demomovieapp.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demomovieapp.databinding.ItemMediaBinding
import com.example.demomovieapp.model.Tv

class TvListAdapter: PagingDataAdapter<Tv, TvListAdapter.ViewHolder>(TV_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder (
        ItemMediaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        item?.let { holder.bind(it) }
    }

    class ViewHolder(private val binding: ItemMediaBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(tv: Tv) = with(binding) {
            title.text = tv.title
            Glide.with(poster)
                .load(tv.poster_path)
                .centerCrop()
                .into(poster)
        }
    }

    object TV_COMPARATOR: DiffUtil.ItemCallback<Tv>() {
        override fun areItemsTheSame(oldItem: Tv, newItem: Tv): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Tv, newItem: Tv): Boolean {
            return oldItem == newItem
        }
    }
}