package com.example.japanesekoreanrestohalal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailJepangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_jepang)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val restojepang = intent.getParcelableExtra<Restojepang>(JepangMainActivity2.INTENT_PARACELABLE)

        val imgrestoj = findViewById<ImageView>(R.id.img_item_photo)
        val namerestoj = findViewById<TextView>(R.id.tv_item_name)
        val deskripsirestoj = findViewById<TextView>(R.id.tv_item_description)
        val jadwalrestoj = findViewById<TextView>(R.id.tv_item_jadwal)

        imgrestoj.setImageResource(restojepang?.imgrestoj!!)
        namerestoj.text = restojepang.namerestoj
        deskripsirestoj.text = restojepang.deskripsiretoj
        jadwalrestoj.text = restojepang.jadwalrestoj
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}