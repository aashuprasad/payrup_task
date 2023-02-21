package com.example.payruptask

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.payruptask.databinding.ContactListViewItemBinding
import com.example.payruptask.network.models.Contacts
import com.example.payruptask.overview.ContactListAdapter
import com.example.payruptask.overview.ContactsAPIStatus

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Contacts>?) {
    val adapter = getOrCreateAdapter(recyclerView)
    adapter.submitList(data)
}


private fun getOrCreateAdapter(recyclerView: RecyclerView): ContactListAdapter {
    return if (recyclerView.adapter != null && recyclerView.adapter is ContactListAdapter) {
        recyclerView.adapter as ContactListAdapter
    } else {
        val bindRecyclerAdapter = ContactListAdapter()
        recyclerView.adapter = bindRecyclerAdapter
        bindRecyclerAdapter
    }
}

@BindingAdapter("apiStatus")
fun bindStatus(statusImageView: ImageView, status: ContactsAPIStatus?) {
    if (status == ContactsAPIStatus.LOADING) {
        statusImageView.visibility = View.VISIBLE
        statusImageView.setImageResource(R.drawable.loading_animation)
    }
    else if (status == ContactsAPIStatus.ERROR) {
        statusImageView.visibility = View.VISIBLE
        statusImageView.setImageResource(R.drawable.ic_connection_error)
    }
    else if (status == ContactsAPIStatus.DONE) {
        statusImageView.visibility = View.GONE
    }
}

@BindingAdapter("addressData")
fun bindAddress(textView : TextView, data : Contacts){
    val address = "${data.address.suite}, ${data.address.street},\n" +
            "${data.address.city}, ${data.address.zipcode}"
    textView.text = address
}

@BindingAdapter("companyData")
fun bindCompany(textView : TextView, data : Contacts){
    val company = "${data.company.name},\n${data.company.catchPhrase},\n${data.company.bs}"
    textView.text = company
}



