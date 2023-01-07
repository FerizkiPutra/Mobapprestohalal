package com.example.japanesekoreanrestohalal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class AboutUs(
    val img: Int,
    val name: String,
    val deskripsi: String
) : Parcelable