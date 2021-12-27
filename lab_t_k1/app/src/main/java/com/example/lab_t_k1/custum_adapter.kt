package com.example.lab_t_k1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView


class custum_adapter : RecyclerView.Adapter<viewholder>() {


    val title = arrayListOf<String>("First","Second","Third")
    override fun getItemCount(): Int {
        return title.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val linflater = LayoutInflater.from(parent?.context)
        val newinf = linflater.inflate(R.layout.new_layout,parent,false)
        return viewholder(newinf)

    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val titlev = title.get(position)

        holder.v.textView.text=titlev
    }

}
class  viewholder(val v:View):RecyclerView.ViewHolder(v){

}

