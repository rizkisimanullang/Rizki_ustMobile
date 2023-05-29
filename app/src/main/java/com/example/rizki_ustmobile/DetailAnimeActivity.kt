package com.example.rizki_ustmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.rizki_ustmobile.Anime
import com.example.rizki_ustmobile.MainActivity
import com.example.rizki_ustmobile.R


class DetailAnimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_anime)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anime = intent.getParcelableExtra<Anime>(MainActivity.INTENT_PARCELABLE)

        val imganime = findViewById<ImageView>(R.id.img_item_photo)
        val nameanime = findViewById<TextView>(R.id.tv_item_name)
        val descanime = findViewById<TextView>(R.id.tv_item_description)

        imganime.setImageResource(anime?.imganime!!)
        nameanime.text = anime.nameanime
        descanime.text = anime.descanime

    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}