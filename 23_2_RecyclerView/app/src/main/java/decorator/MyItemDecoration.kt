package decorator

import android.graphics.Canvas
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import ru.ustyuzhinskiydev.a23_2_recyclerview.R

class MyItemDecoration : RecyclerView.ItemDecoration() {
    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
        parent.children.forEachIndexed { index, view ->
            if ((index+1) % 2 == 0) {
                view.setBackgroundResource(R.color.colorYellow)
            } else {
                view.setBackgroundResource(R.color.colorBlue)
            }
        }
    }
}