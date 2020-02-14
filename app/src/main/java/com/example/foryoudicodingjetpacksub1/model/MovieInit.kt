package com.example.foryoudicodingjetpacksub1.model

import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class MovieInit (
    var filmtitle: String,
    var imagelist: Int,
    var imageplay: Int,
    var sutradara: String,
    var durasi: String,
    var review: String,
    var penulis: String,
    var rating: String,
    var release: String,
    var deskripsi: String
): Parcelable