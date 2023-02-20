package com.example.payruptask.overview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.payruptask.databinding.ContactListViewItemBinding
import com.example.payruptask.network.models.Contacts

enum class ApiStatus{LOADING, ERROR, DONE}

class ContactListAdapter : ListAdapter<Contacts, ContactListAdapter.ContactsViewHolder>(DiffCallback) {

    class ContactsViewHolder(private var binding: ContactListViewItemBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(contacts: Contacts) {
            binding.contact =contacts
            // This is important, because it forces the data binding to execute immediately,
            // which allows the RecyclerView to make the correct view size measurements
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Contacts>() {
        override fun areItemsTheSame(oldItem: Contacts, newItem: Contacts): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Contacts, newItem: Contacts): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ContactsViewHolder {
        return ContactsViewHolder(ContactListViewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contacts = getItem(position)
        holder.bind(contacts)
    }
}