package com.example.payruptask.detail

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.payruptask.network.models.Contacts

class DetailViewModelFactory(
        private val contacts: Contacts,
        private val application: Application) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(contacts, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
