package com.example.foryoudicodingjetpacksub1.view.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.foryoudicodingjetpacksub1.R
import com.example.foryoudicodingjetpacksub1.helper.AdapterTabLayout
import com.example.foryoudicodingjetpacksub1.helper.Tools
import com.example.foryoudicodingjetpacksub1.view.movie.MovieFragment
import com.example.foryoudicodingjetpacksub1.view.tvshow.TvShowFragment
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initToolbar()
        initComponent()
    }

    private fun initToolbar(){
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.title = " tererah Mau di kasih title apa"
        Tools.setSystemBarColor(this, R.color.grey_900)
    }

    private fun initComponent() {
        setupViewPager(viewpager_main)
        tablayout_main.setupWithViewPager(viewpager_main)

    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter =
            AdapterTabLayout(supportFragmentManager)
        adapter.addFragment(MovieFragment(), "Movie")
        adapter.addFragment(TvShowFragment(), "Tv Show")
        viewPager.adapter = adapter

    }
}
