package com.example.rizki_ustmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rizki_ustmobile.Anime
import com.example.rizki_ustmobile.AnimeAdapter
import com.example.rizki_ustmobile.DetailAnimeActivity


class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animeList = listOf<Anime>(
            Anime(
                R.drawable.kyoukosuiri ,
                nameanime =  "Kyouko Suiri",
                descanime = "Tersembunyi dari mata biasa terdapat dunia tidak dikenal yang dihuni oleh makhluk fantasi" +
                        "seperti youkai,salah satu jenis roh yang menghuni dunia.Sementara sebagian besarnya jinak terdapat subjek" +
                        "tertentu yang mengancam keamanan dan perdamaian. Disini Kotoko si Dewa Kebijaksanaan bertugas menyelesaikan" +
                        "setiap masalah tersebut." ),
            Anime(
                R.drawable.fmab,
                nameanime =  "Fullmetal Alchemist : Brotherhood",
                descanime = "Elric bersaudara melakukan pencarian batu philoshoper demi tujuan" +
                        "mengembalikan tubuh mereka yang hilang akibat melakukan ritual sihir untuk" +
                        "mencoba menghidupkan ibu mereka kembali dari kematian" ),
            Anime(
                R.drawable.oshinoko,
                nameanime =  "Oshi No Ko",
                descanime = "Kisah Pembalasan dendam,Pertumbuhan,dan masa muda yang menceritakan sisi" +
                        "gelap dunia hiburan idol Jepang. Kisah dari reinkarnasi 2 orang tertentu menjadi anak " +
                        "seorang idol genius dimulai!" ),
            Anime(
                R.drawable.inuyasha,
                nameanime =  "Inuyasha",
                descanime = "Kagome Higurashi pada ulang tahun ke 15nya tiba tiba terjebak dalam situasi " +
                        "dimana dia terjebak dalam jaman feodal jepang dimana makhluk supranatural hadir di setiap sudut" +
                        "kehidupan"  )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_anime)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AnimeAdapter(this,animeList){
            val intent = Intent (this, DetailAnimeActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}