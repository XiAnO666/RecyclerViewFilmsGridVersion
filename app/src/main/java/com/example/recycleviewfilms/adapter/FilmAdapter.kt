package com.example.recycleviewfilms.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewfilms.FilmDetailsActivity
import com.example.recycleviewfilms.Films
import com.example.recycleviewfilms.R

class FilmAdapter(private val filmsList: List<Films>) : RecyclerView.Adapter<FilmViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FilmViewHolder(layoutInflater.inflate(R.layout.item_film, parent, false))
    }

    override fun getItemCount(): Int {
       return filmsList.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item = filmsList[position]
        holder.render(item)

        holder.itemView.setOnClickListener{
            val context = holder.itemView.context
            val intent = Intent(context, FilmDetailsActivity::class.java)
            intent.putExtra("script", item.script)
            context.startActivity(intent)
        }
    }
}