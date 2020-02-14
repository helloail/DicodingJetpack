package com.example.foryoudicodingjetpacksub1.view.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.foryoudicodingjetpacksub1.R
import com.example.foryoudicodingjetpacksub1.helper.Tools
import com.example.foryoudicodingjetpacksub1.model.MovieInit
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private lateinit var detailVM: DetailViewModel

    companion object {
        const val SET_PARCELABLE = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initToolbar()
        initComponent()
    }

    private fun initComponent() {

        detailVM = ViewModelProviders.of(this).get(DetailViewModel::class.java)
        val data = intent.getParcelableExtra<MovieInit>(SET_PARCELABLE)
        if (data != null) {
            detailVM.setViewModelValue(data)
            titlevideo.text = detailVM.filmtitle
            ratingbar.rating = Tools.displayrating(detailVM.rating.toFloat())
            reviews.text = detailVM.review
            titledesc.text = detailVM.filmtitle
            RuningTime.text = detailVM.durasi
            ReleaseDate.text = detailVM.release
            director.text = detailVM.sutradara
            writer.text = detailVM.penulis
            discription.text = detailVM.deskripsi
            Picasso.get().load(detailVM.imagelist).into(imagelist)
            Picasso.get().load(detailVM.imageplay).into(imageplayer)

        }
    }

    private fun initToolbar() {
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.title = " "
        //set back button
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        Tools.setSystemBarColor(this, R.color.grey_900)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}