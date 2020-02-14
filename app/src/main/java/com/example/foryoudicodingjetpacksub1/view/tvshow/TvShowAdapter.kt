package com.example.foryoudicodingjetpacksub1.view.tvshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foryoudicodingjetpacksub1.R
import com.example.foryoudicodingjetpacksub1.helper.Tools
import com.example.foryoudicodingjetpacksub1.model.MovieInit
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_listtvshow.view.*

class TvShowAdapter(
    private val favorite: List<MovieInit>,
    private val listener: (MovieInit) -> Unit

) : RecyclerView.Adapter<TvShowAdapter.FavoriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val mView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_listtvshow, parent, false)
        return FavoriteViewHolder(
            mView
        )
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bindItem(favorite[position], listener)
    }

    override fun getItemCount(): Int = favorite.size


    class FavoriteViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        fun bindItem(movie: MovieInit, listener: (MovieInit) -> Unit) {

            itemView.titletv.text = movie.filmtitle
            itemView.ratingbar.rating = Tools.displayrating(movie.rating.toFloat())
            Picasso.get().load(movie.imagelist).into(itemView.imageplay)

            itemView.setOnClickListener { listener(movie) }


        }
    }
}