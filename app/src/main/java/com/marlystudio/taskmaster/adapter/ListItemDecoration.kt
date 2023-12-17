package com.marlystudio.taskmaster.adapter

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

 public class ListItemDecoration : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.bottom = 10
    }
}