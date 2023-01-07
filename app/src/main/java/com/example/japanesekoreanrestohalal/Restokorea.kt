package com.example.japanesekoreanrestohalal

import  android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Restokorea(
    val imgrestok: Int,
    val namerestok: String,
    val deskripsiretok: String
) : Parcelable