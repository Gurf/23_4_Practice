package ru.ustyuzhinskiydev.a23_4_practice

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var data: Array<Int>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
   inner class MyViewHolder(itemV: View) : RecyclerView.ViewHolder(itemV) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder.itemView as TextView).text = "${data[position]}"
    }

    override fun getItemCount(): Int {
        return data.size
    }

}