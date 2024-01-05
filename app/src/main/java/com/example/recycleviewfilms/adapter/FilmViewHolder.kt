package com.example.recycleviewfilms.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycleviewfilms.Films
import com.example.recycleviewfilms.R


class FilmViewHolder(view: View):RecyclerView.ViewHolder(view){

    val filmTitle = view.findViewById<TextView>(R.id.tvTitle)
    val filmYear = view.findViewById<TextView>(R.id.tvYear)
    val filmPoster = view.findViewById<ImageView>(R.id.ivPoster)

    fun render(films: Films){
        filmTitle.text = films.title
        filmYear.text = films.year
        Glide.with(filmPoster.context).load(films.cartel).into(filmPoster)
    }
}