package ru.ustyuzhinskiydev.a23_4_practice

import androidx.recyclerview.widget.DiffUtil

class NumbersDiff(val oldList: Array<Int>, val newList: Array<Int>) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val old = oldList[oldItemPosition]
        val new = newList[newItemPosition]
        return old == new
//        return areItemsTheSame(oldItemPosition, newItemPosition)

    }
}