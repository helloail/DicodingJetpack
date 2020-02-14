package com.example.foryoudicodingjetpacksub1.view.detail

import androidx.lifecycle.ViewModel
import com.example.foryoudicodingjetpacksub1.model.MovieInit

class DetailViewModel : ViewModel() {

    var filmtitle = ""
    var imagelist = 0
    var imageplay = 0
    var sutradara = ""
    var durasi = ""
    var review = ""
    var penulis = ""
    var rating = ""
    var release = ""
    var deskripsi = ""


    fun setViewModelValue(data: MovieInit) {

        filmtitle = data.filmtitle
        imagelist = data.imagelist
        imageplay = data.imageplay
        sutradara = data.sutradara
        durasi = data.durasi
        review = data.review
        penulis = data.penulis
        rating = data.rating
        release = data.release
        deskripsi = data.deskripsi

    }

}