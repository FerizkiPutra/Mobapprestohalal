package com.example.japanesekoreanrestohalal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.aboutus_main.*
import kotlinx.android.synthetic.main.source_main.*

class ItemMain2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_main2)

        var data = intent.getStringExtra("name");

        Log.e("TAG","data ===> $data");


        when (data){
            "About Us" ->
                img_item_photo.setImageResource(R.drawable.wong)
            "Source" ->
                img_item_photo.setImageResource(R.drawable.src)


        }
    }
}