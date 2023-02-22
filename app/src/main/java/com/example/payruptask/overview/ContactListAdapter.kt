package com.example.payruptask.overview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.payruptask.databinding.ContactListViewItemBinding
import com.example.payruptask.network.models.Contacts

class ContactListAdapter(val onClickListener: OnClickListener) :
    ListAdapter<Contacts, ContactListAdapter.ContactsViewHolder>(DiffCallback) {

    class ContactsViewHolder(private var binding: ContactListViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(contacts: Contacts) {
            binding.contact = contacts
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        return ContactsViewHolder(ContactListViewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contacts = getItem(position)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(contacts)
        }
        holder.bind(contacts)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Contacts>() {
        override fun areItemsTheSame(oldItem: Contacts, newItem: Contacts): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Contacts, newItem: Contacts): Boolean {
            return oldItem.id == newItem.id
        }
    }

    class OnClickListener(val clickListener: (contacts: Contacts) -> Unit) {
        fun onClick(contacts: Contacts) = clickListener(contacts)
    }
}