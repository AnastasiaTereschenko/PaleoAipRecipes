package com.a.paleoaiprecipes.ui.viewHolder

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.a.paleoaiprecipes.misc.inflate

open class BaseViewHolder(layoutResId: Int, parent: ViewGroup)
    : RecyclerView.ViewHolder(parent.context.inflate(layoutResId, parent)) {
    open fun unbind() {}
}