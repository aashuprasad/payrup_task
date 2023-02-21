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

enum class ContactsAPIStatus { LOADING, ERROR, DONE }

class OverviewViewModel : ViewModel() {

    private val _status = MutableLiveData<ContactsAPIStatus>()

    val status: LiveData<ContactsAPIStatus>
        get() = _status

    private val _contacts = MutableLiveData<List<Contacts>>()

    val contacts: LiveData<List<Contacts>>
        get() = _contacts

    private val _navigateToSelectedContact = MutableLiveData<Contacts?>()

    val navigateToSelectedContact: MutableLiveData<Contacts?>
        get() = _navigateToSelectedContact

    init {
        getContactsProperties()

    }

    private fun getContactsProperties() {
        _status.value = ContactsAPIStatus.LOADING
        viewModelScope.launch {
            try {
                _contacts.value = ContactsAPI.retrofitService.getContacts()
                _status.value = ContactsAPIStatus.DONE
            } catch (e: Exception) {
                _status.value = ContactsAPIStatus.ERROR
                _contacts.value = ArrayList()
            }
        }
    }

    fun displayContactDetails(contact: Contacts) {
        _navigateToSelectedContact.value = contact
    }

    fun displayContactDetailsComplete() {
        _navigateToSelectedContact.value = null
    }
}
