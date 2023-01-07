package com.example.japanesekoreanrestohalal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailKoreaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_korea)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val restokorea = intent.getParcelableExtra<Restokorea>(KoreaMainActiivity.INTENT_PARACELABLE)

        val imgrestok = findViewById<ImageView>(R.id.img_item_photok)
        val namerestok = findViewById<TextView>(R.id.tv_item_namek)
        val deskripsirestok = findViewById<TextView>(R.id.tv_item_descriptionk)

        imgrestok.setImageResource(restokorea?.imgrestok!!)
        namerestok.text = restokorea.namerestok
        deskripsirestok.text = restokorea.deskripsiretok
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}