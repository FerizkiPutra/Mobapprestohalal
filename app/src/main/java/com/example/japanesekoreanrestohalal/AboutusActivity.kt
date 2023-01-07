package com.example.japanesekoreanrestohalal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AboutusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aboutus_main)

        val aboutusList = listOf<AboutUs>(
            AboutUs(
                R.drawable.hlh,
                "Halo",
                "Nama"
            ),
            AboutUs(
                R.drawable.hlh,
                "name",
            "Nama",
            )
        )
        val recylerview = findViewById<RecyclerView>(R.id.rv_about)
        recylerview.layoutManager = LinearLayoutManager(this)
        recylerview.setHasFixedSize(true)
        recylerview.adapter = AboutusAdapter(this, aboutusList){

        }


    }


}