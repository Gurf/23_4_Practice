package ru.ustyuzhinskiydev.a23_2_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import decorator.MyItemDecoration

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val recycleView = recycler_view
        val recycleView = findViewById<RecyclerView>(R.id.recycler_view)
//        recycleView.layoutManager = GridLayoutManager(this,4)
//        val myAdapter = MyAdapter()
        recycleView.adapter = MyAdapter()
        recycleView.addItemDecoration(MyItemDecoration())
    }
}