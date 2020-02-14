package com.example.foryoudicodingjetpacksub1.view.tvshow

import androidx.lifecycle.ViewModel
import com.example.foryoudicodingjetpacksub1.data.DataInit
import com.example.foryoudicodingjetpacksub1.model.MovieInit

class TvShowViewModel  :  ViewModel() {

    fun getTvShowData(): MutableList<MovieInit> {
        return DataInit().setTvShowData()
    }
}