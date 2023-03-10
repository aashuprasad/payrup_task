package com.example.payruptask.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.payruptask.network.models.Contacts

/**
 * The [ViewModel] that is associated with the [DetailFragment].
 */
class DetailViewModel(contacts: Contacts, app: Application) : AndroidViewModel(app) {
    private val _selectedContact = MutableLiveData<Contacts>()

    val selectedContact: LiveData<Contacts>
        get() = _selectedContact

    init {
        _selectedContact.value = contacts
    }
}
