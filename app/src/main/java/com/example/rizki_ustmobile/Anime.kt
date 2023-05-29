package com.example.rizki_ustmobile

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Anime (
    val imganime: Int,
    val nameanime: String,
    val descanime: String
) : Parcelable
