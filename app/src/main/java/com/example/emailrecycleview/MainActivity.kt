package com.example.emailrecycleview

import EmailAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emailrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterEmail = EmailAdapter(generateDummy()) { Email ->
            // When an item is clicked, send data to DetailActivity
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Name", Email.name)
            intent.putExtra("date", Email.date)
            intent.putExtra("description", Email.description)
            startActivity(intent)
        }


    with(binding){
            recyclerView.apply {
                adapter = adapterEmail
                layoutManager = LinearLayoutManager(this@MainActivity)

            }
        }

    }
    private fun generateDummy(): List<Email> {
        return listOf(
            Email("BudiGanteng", "18 Nov", "Eh guys, breakfast gratis udah ready nih! Buruan ke ruang makan biar nggak kehabisan, makanannya enak banget sumpah! Jangan ngaret yaaa."),
            Email("AurelKpop", "19 Nov", "Oppa itu emang gak ada tandingan sih, visualnya gila parah, kayak keluar dari drama! Aku udah nggak bisa move on deh."),
            Email("MamatCoding", "17 Nov", "Cuma mau bilang ya, aku adalah developer paling ngoding di antara kalian semua. Jangan iri ya, wkwk."),
            Email("GinaMakan", "21 Nov", "Temen-temen, siapa yang mau lunch bareng nanti? Aku pengen banget nyobain tempat baru yang viral itu. Kuy gaskeun!"),
            Email("RendySantuy", "15 Nov", "Kalian terlalu serius deh, chill aja dong. Hidup ini cuma sekali, nikmatin aja!"),
            Email("FanyDrama", "22 Nov", "Plis ya, dia tuh cuma acting aja sok perfect, padahal aslinya gak gitu. Aku yang tau banget semua kebohongannya."),
            Email("AdiTechno", "14 Nov", "Wah, teknologi AI makin canggih aja sih. Aku rasa sebentar lagi robot bakal takeover dunia. Prepare yourself guys!"),
            Email("NanaFashion", "23 Nov", "OOTD hari ini fix juara banget. Aku berasa kayak di runway Paris deh, siapa yang mau liat? Hehe."),
            Email("JokoMeme", "16 Nov", "Gua tadi liat meme kocak banget di IG, sampe ketawa ngakak sendiri deh. Kalian harus lihat!"),
            Email("TinaSquad", "24 Nov", "Squad, kita harus hangout nih. Weekend masih kosong, siapa yang siap?"),
            Email("CiciYoga", "13 Nov", "Waktu aku nyobain yoga tadi pagi, rasanya fresh banget! Kalian harus coba deh, buat badan dan pikiran jadi rileks!"),
            Email("LeoGaming", "12 Nov", "Gila, game baru yang aku tunggu-tunggu akhirnya keluar juga! Sumpah deh, ga sabar mainin."),
            Email("RinaSelfie", "25 Nov", "Selfie pagi ini kece abis, kayak bintang K-Drama. Mau liat? Langsung DM aja."),
            Email("DikaMauKopi", "26 Nov", "Temen-temen, ada yang mau kopi di kafe baru? Aku udah nyobain dan rasanya enak banget!"),
            Email("SariNgegas", "11 Nov", "Gak ada yang bisa ngalahin energi gue hari ini. Lagi full power untuk capai target!"),
            Email("FadilPop", "27 Nov", "Gue baru denger lagu baru ini, catchy banget! Lagu pop Korea selalu bisa ngasih vibes yang beda."),
            Email("CacaDoodles", "28 Nov", "Lagi belajar gambar digital nih, siapa yang suka desain? Bisa share tips dong!"),
            Email("KikiVibes", "29 Nov", "Weekend vibes, stay chill aja dan nikmatin waktu luang. Jangan stres-stres, hidup itu harus balance."),
            Email("RizkiFoodie", "30 Nov", "Nih ada rekomendasi tempat makan yang wajib kalian coba, rasanya enak banget! Yuk buruan datang.")


            // Add more emails as needed
        )
    }
}