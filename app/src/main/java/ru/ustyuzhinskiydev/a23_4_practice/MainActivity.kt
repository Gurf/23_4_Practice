package ru.ustyuzhinskiydev.a23_4_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 5)
        val mass: Array<Int> = Array(30) { i ->
            i + 1
        }
        /*val r = Random(System.currentTimeMillis())
        for (i in mass.indices) {
            val newI = r.nextInt(mass.size)
            val temp = mass[i]
            mass[i] = mass[newI]
            mass[newI] = temp
        }*/

        recyclerView.adapter = MyAdapter(mass)//(recyclerView.adapter as MyAdapter)
//         = adapter1




        fun mixing(/*adapter: MyAdapter, newList: Array<Int>*/) {
            val adapter = (recyclerView.adapter as MyAdapter)
//            val newList = mass
            val newList = Array(30) {
               i -> i + 1
            }
            val r = Random(System.currentTimeMillis())
            for (i in newList.indices) {
                val newI = r.nextInt(adapter.data.size)
                val temp = newList[i]
                newList[i] = newList[newI]
                newList[newI] = temp
            }
            val oldList = adapter.data
            val numbersDiff = NumbersDiff(oldList, newList)
            val diffResult = DiffUtil.calculateDiff(numbersDiff)
            adapter.data = newList
            diffResult.dispatchUpdatesTo(adapter)
        }

        val refresh = findViewById<Button>(R.id.refresh_button)
        refresh.setOnClickListener {
/*val newList =  Array(30) { i ->
            i + 1

        }*/

            mixing(/*adapter1,newList*/)
        }
    }
}