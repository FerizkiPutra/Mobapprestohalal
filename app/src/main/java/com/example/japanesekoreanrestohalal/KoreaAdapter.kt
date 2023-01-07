package com.example.japanesekoreanrestohalal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KoreaAdapter (private val context: Context, private val restokorea : List<Restokorea>, val listener: (Restokorea) -> Unit )
    : RecyclerView.Adapter<KoreaAdapter.RestokoreaViewHolder>(){
    class RestokoreaViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgrestok = view.findViewById<ImageView>(R.id.img_item_photok)
        val namerestok = view.findViewById<TextView>(R.id.tv_item_namek)
        val deskripsirestok = view.findViewById<TextView>(R.id.tv_item_descriptionk)

        fun bindview(restokorea : Restokorea, listener: (Restokorea) -> Unit) {
            imgrestok.setImageResource(restokorea.imgrestok)
            namerestok.text = restokorea.namerestok
            deskripsirestok.text = restokorea.deskripsiretok

            itemView.setOnClickListener{
                listener(restokorea)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestokoreaViewHolder {
        return KoreaAdapter.RestokoreaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_restokorea, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RestokoreaViewHolder, position: Int) {
        holder.bindview(restokorea[position], listener)
    }

    override fun getItemCount(): Int = restokorea.size

    }


