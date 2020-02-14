package com.example.foryoudicodingjetpacksub1.Movie

import com.example.foryoudicodingjetpacksub1.view.movie.MovieViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ViewModelMovieTest {

    private lateinit var movieViewModel: MovieViewModel

    @Before
    fun setUp() {
        movieViewModel = MovieViewModel()
    }

    @Test
    fun getTVShow() {
        val dataMovie = movieViewModel.getMoviesData()
        Assert.assertNotNull(dataMovie)
        Assert.assertEquals(12, dataMovie.size)
    }

}