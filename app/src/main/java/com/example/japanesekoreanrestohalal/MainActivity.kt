package com.example.japanesekoreanrestohalal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     card_japan.setOnClickListener{
         startActivity(Intent(this, JepangMainActivity2::class.java ))
     }
        korean_card.setOnClickListener{
            startActivity(Intent(this, KoreaMainActiivity::class.java))
        }

        }
    }




