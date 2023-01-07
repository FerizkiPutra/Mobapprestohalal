package com.example.japanesekoreanrestohalal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer.ListListener
import androidx.recyclerview.widget.RecyclerView

class JepangAdapter (private val context: Context, private val restojepang:List<Restojepang>, val listener: (Restojepang) -> Unit )
    : RecyclerView.Adapter<JepangAdapter.RestojepangViewHolder>(){
    class RestojepangViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgrestoj = view.findViewById<ImageView>(R.id.img_item_photo)
        val namerestoj = view.findViewById<TextView>(R.id.tv_item_name)
        val deskripsirestoj = view.findViewById<TextView>(R.id.tv_item_description)
        val jadwalrestoj =view.findViewById<TextView>(R.id.tv_item_jadwal)

        fun bindview(restojepang : Restojepang, listener: (Restojepang) -> Unit) {
            imgrestoj.setImageResource(restojepang.imgrestoj)
            namerestoj.text = restojepang.namerestoj
            deskripsirestoj.text = restojepang.deskripsiretoj
            jadwalrestoj.text = restojepang.jadwalrestoj

            itemView.setOnClickListener{
                listener(restojepang)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestojepangViewHolder {
        return RestojepangViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_restojepang, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RestojepangViewHolder, position: Int) {
        holder.bindview(restojepang[position], listener)
    }

    override fun getItemCount(): Int = restojepang.size

    }


