package com.example.payruptask

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.payruptask.databinding.ContactListViewItemBinding
import com.example.payruptask.network.models.Contacts
import com.example.payruptask.overview.ContactListAdapter

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Contacts>?) {
    val adapter = recyclerView.adapter as ContactListAdapter
    adapter.submitList(data)
}