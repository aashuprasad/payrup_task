package com.example.payruptask.overview


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.payruptask.network.ContactsAPI
import com.example.payruptask.network.models.Contacts
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class OverviewViewModel : ViewModel() {

    // The internal MutableLiveData String that stores the most recent response
    private val _response = MutableLiveData<String>()

    // The external immutable LiveData for the response String
    val response: LiveData<String>
        get() = _response

    init {
        getContactsProperties()

    }

    private fun getContactsProperties() {
        viewModelScope.launch {
            try {
                var listResult = ContactsAPI.retrofitService.getContacts()
                _response.value = "Success: ${listResult.size} Contacts properties retrieved"
            } catch (e: Exception) {
                _response.value = "Failure: ${e.message}"
            }
        }
    }
}
