package com.example.payruptask.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.payruptask.network.models.Contacts

class DetailViewModel(contactsDetail: Contacts, app: Application) : AndroidViewModel(app) {
    private val _selectedContact = MutableLiveData<Contacts>()
    val selectedContact: LiveData<Contacts> get() = _selectedContact

    init {
        _selectedContact.value = contactsDetail
    }
}
