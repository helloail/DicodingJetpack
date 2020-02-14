package com.example.foryoudicodingjetpacksub1.view.tvshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.example.foryoudicodingjetpacksub1.view.detail.DetailActivity
import com.example.foryoudicodingjetpacksub1.R
import com.example.foryoudicodingjetpacksub1.helper.SpacingItemDecoration
import com.example.foryoudicodingjetpacksub1.helper.Tools
import com.example.foryoudicodingjetpacksub1.model.MovieInit
import com.example.foryoudicodingjetpacksub1.view.movie.MovieViewModel
import kotlinx.android.synthetic.main.fragment_tvshow.*
import org.jetbrains.anko.support.v4.startActivity

class TvShowFragment : Fragment() {
    private lateinit var mAdapter: TvShowAdapter
    private lateinit var tvshowViewModel: TvShowViewModel
    private var data = mutableListOf<MovieInit>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initRecycler()
    }

    private fun initRecycler() {

        tvshowViewModel = ViewModelProviders.of(this).get(TvShowViewModel::class.java)
        data = tvshowViewModel.getTvShowData()

        mAdapter = TvShowAdapter(data) {
            startActivity<DetailActivity>(DetailActivity.SET_PARCELABLE to it)
        }
        mAdapter.notifyDataSetChanged()



        recyclerViewTvShow.setLayoutManager(GridLayoutManager(context, 2))
        recyclerViewTvShow.addItemDecoration(
            SpacingItemDecoration(
                2,
                Tools.dpToPx(context, 8),
                true
            )
        )
        recyclerViewTvShow.setHasFixedSize(true)
        recyclerViewTvShow.setItemAnimator(DefaultItemAnimator())

        recyclerViewTvShow.adapter = mAdapter


    }



}