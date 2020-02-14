package com.example.foryoudicodingjetpacksub1.TvShow

import com.example.foryoudicodingjetpacksub1.view.tvshow.TvShowViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ViewModelTvShowTest {
    private lateinit var tvShowViewModel: TvShowViewModel

    @Before
    fun setUp() {
        tvShowViewModel = TvShowViewModel()
    }

    @Test
    fun getTVShow() {
        val datatvShow = tvShowViewModel.getTvShowData()
        Assert.assertNotNull(datatvShow)
        Assert.assertEquals(12, datatvShow.size)
    }

}