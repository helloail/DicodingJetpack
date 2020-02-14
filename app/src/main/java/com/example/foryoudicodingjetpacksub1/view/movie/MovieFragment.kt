package com.example.foryoudicodingjetpacksub1.view.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foryoudicodingjetpacksub1.view.detail.DetailActivity
import com.example.foryoudicodingjetpacksub1.R
import com.example.foryoudicodingjetpacksub1.model.MovieInit
import kotlinx.android.synthetic.main.fragment_movie.*
import org.jetbrains.anko.support.v4.startActivity

class MovieFragment : Fragment() {

    private lateinit var mAdapter: MovieListAdapter
    private lateinit var movieViewModel: MovieViewModel
    private var data = mutableListOf<MovieInit>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initRecycler()
    }

    fun initRecycler() {

        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        data = movieViewModel.getMoviesData()

        mAdapter = MovieListAdapter(data) {
            startActivity<DetailActivity>(DetailActivity.SET_PARCELABLE to it)
        }
        mAdapter.notifyDataSetChanged()

        recyclerViewMovie.layoutManager = LinearLayoutManager(context)
        recyclerViewMovie.adapter = mAdapter

    }

}