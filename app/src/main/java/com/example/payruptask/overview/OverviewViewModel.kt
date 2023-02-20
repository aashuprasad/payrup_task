package com.example.payruptask.overview


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.payruptask.network.ContactsAPI
import com.example.payruptask.network.models.Contacts
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
        getMarsRealEstateProperties()
    }

    private fun getMarsRealEstateProperties() {
        ContactsAPI.retrofitService.getContacts().enqueue( object: Callback<List<Contacts>> {
            override fun onFailure(call: Call<List<Contacts>>, t: Throwable) {
                _response.value = "Failure: " + t.message
            }

            override fun onResponse(call: Call<List<Contacts>>, response: Response<List<Contacts>>) {
                _response.value = "Success: ${response.body()?.size} Contacts properties retrieved"
            }
        })
    }
}
