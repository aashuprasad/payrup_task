package com.example.payruptask.overview


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.payruptask.network.ContactsAPI
import com.example.payruptask.network.ContactsAPI.retrofitService
import com.example.payruptask.network.models.Contacts
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class OverviewViewModel : ViewModel() {

    private val _status = MutableLiveData<String>()

    val status: LiveData<String>
        get() = _status

    private val _contacts = MutableLiveData<List<Contacts>>()

    val contacts: LiveData<List<Contacts>>
        get() = _contacts
    init {
        getContactsProperties()

    }

    private fun getContactsProperties() {
        viewModelScope.launch {
            try {
                var listResult = ContactsAPI.retrofitService.getContacts()
                _status.value = "Success: ${listResult.size}"
                if (listResult.size > 0) {
                    _contacts.value = listResult
                }
            } catch (e: Exception) {
                _status.value = "Failure: ${e.message}"
            }
        }
    }
}
