package ru.ustyuzhinskiydev.a23_3_itemdecoration_itemanimator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById <RecyclerView> (R.id.recycler_view)
//Загружаем анимацию, созданную в XML формате
        val anim = AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation)
//Передаем ее в recyclerView
        recyclerView.layoutAnimation = anim
//Запускаем анимацию на выполнение
        recyclerView.scheduleLayoutAnimation()

    }
}