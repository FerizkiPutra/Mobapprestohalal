package com.example.japanesekoreanrestohalal

import  android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Restojepang(
    val imgrestoj: Int,
    val namerestoj: String,
    val deskripsiretoj: String,
    val jadwalrestoj: String
) : Parcelable
