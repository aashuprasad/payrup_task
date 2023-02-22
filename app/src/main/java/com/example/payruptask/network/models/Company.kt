package com.example.payruptask.network.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Company(
    val bs: String, val catchPhrase: String, val name: String
) : Parcelable