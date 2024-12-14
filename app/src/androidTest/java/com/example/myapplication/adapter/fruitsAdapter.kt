package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class fruitsAdapter(
    val context: Context,
    val imagelist : ArrayList<Int>,
    val nameList : ArrayList<String>,
    val decsList : ArrayList<String>
    ) :RecyclerView.Adapter<fruitsAdapter.FruitsViewHolder>(){
    class FruitsViewHolder(itemView: View):
            RecyclerView.ViewHolder(itemView){
                val image: ImageView=itemView.findViewById(R.id.apple)
                val title: TextView = itemView.findViewById(R.id.appletxt)
                val decs: TextView = itemView.findViewById(R.id.thisapple)            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.fruits_sample, parent, false)
        return FruitsViewHolder(view)


        return FruitsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        holder.title.text  = nameList[position]
        holder.decs.text = decsList[position]
        holder.image.setImageResource(imagelist[position])
    }


}


