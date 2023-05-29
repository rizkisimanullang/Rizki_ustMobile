package com.example.rizki_ustmobile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rizki_ustmobile.R

class AnimeAdapter (private val context: Context,private val anime: List<Anime>, val listener: (Anime) -> Unit)
    : RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>(){
    class AnimeViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imganime = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameanime = view.findViewById<TextView>(R.id.tv_item_name)
        val descanime = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(anime: Anime, listener: (Anime) -> Unit){
            imganime.setImageResource(anime.imganime)
            nameanime.text = anime.nameanime
            descanime.text = anime.descanime
            itemView.setOnClickListener{
                (listener(anime))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_anime, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bindView(anime[position], listener)
    }

    override fun getItemCount(): Int = anime.size

}
