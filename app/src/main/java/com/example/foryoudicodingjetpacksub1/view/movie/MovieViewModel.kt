package com.example.foryoudicodingjetpacksub1.view.movie

import androidx.lifecycle.ViewModel
import com.example.foryoudicodingjetpacksub1.data.DataInit
import com.example.foryoudicodingjetpacksub1.model.MovieInit

class MovieViewModel :  ViewModel() {

    fun getMoviesData() : MutableList<MovieInit> {
        return DataInit().setMovieData()
    }

}