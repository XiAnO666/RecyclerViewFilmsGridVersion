package com.example.recycleviewfilms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewfilms.adapter.FilmAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val decoration = DividerItemDecoration(this,GridLayoutManager(this, 2).orientation )
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerFilms)
        recyclerView.layoutManager =  GridLayoutManager(this, 2)
        recyclerView.adapter = FilmAdapter(FilmsProvider.filmsFirstList)
        recyclerView.addItemDecoration(decoration)
        CoroutineScope(Dispatchers.IO).launch {
            val filmsList = getMovies()
            runOnUiThread {
                recyclerView.adapter = FilmAdapter(filmsList)
            }
        }
    }

    private fun getMovies(): List<Films> {

        val client = OkHttpClient()
        val filmsList = mutableListOf<Films>()
     for (page in 1..10){
        val request = Request.Builder()
            .url("https://api.themoviedb.org/3/movie/top_rated?language=es-ES&page=$page")
            .get()
            .addHeader("accept", "application/json")
            .addHeader(
                "Authorization",
                "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzNjZjNGExYmQ3YjY5NGFmNGRlMDBhYmIxMDY1NDM1YiIsInN1YiI6IjYzODRmMTZmNTM4NjZlMDA3YjA5NmQxMSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.2cCMmZykjCH6dabKYih3aFtU8Jd33zragpeCAmdCnpk"
            )
            .build()

        val response = client.newCall(request).execute()

        val responseBody = response.body?.string()
        val jsonObject = JSONObject(responseBody)
        val jsonArray = jsonObject.getJSONArray("results")


        for (i in 0 until jsonArray.length()) {
            val filmObject = jsonArray.getJSONObject(i)
            val title = filmObject.getString("title")
            val year = filmObject.getString("release_date").substring(0, 4)
            val script = filmObject.getString("overview")
            val posterPath =
                "https://image.tmdb.org/t/p/w300_and_h450_bestv2/" + filmObject.getString("poster_path")

            val film = Films(title, script, year, posterPath)
            filmsList.add(film)
        }
    }
        return filmsList
    }
}