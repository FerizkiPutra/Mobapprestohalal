package com.example.japanesekoreanrestohalal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AboutusAdapter (private val context: Context, private val aboutus : List<AboutUs>, val listener: (AboutUs) -> Unit )
    : RecyclerView.Adapter<AboutusAdapter.AboutViewHolder>(){
    class AboutViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val img = view.findViewById<ImageView>(R.id.img_item_photoa)
        val name = view.findViewById<TextView>(R.id.tv_item_namea)
        val deskripsi = view.findViewById<TextView>(R.id.tv_item_descriptiona)

        fun bindview(aboutus : AboutUs, listener: (AboutUs) -> Unit) {
            img.setImageResource(aboutus.img)
            name.text = aboutus.name
            deskripsi.text = aboutus.deskripsi

            itemView.setOnClickListener{
                listener(aboutus)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutViewHolder {
        return AboutViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_aboutus, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AboutViewHolder, position: Int) {
        holder.bindview(aboutus[position], listener)
    }

    override fun getItemCount(): Int = aboutus.size

}
