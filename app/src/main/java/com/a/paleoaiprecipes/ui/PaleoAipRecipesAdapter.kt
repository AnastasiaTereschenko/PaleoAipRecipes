package com.a.paleoaiprecipes.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.a.paleoaiprecipes.databinding.RowPaleoAipRecipesBinding
import com.a.paleoaiprecipes.ui.viewHolder.PaleoAipRecipesViewHolder

class PaleoAipRecipesAdapter(
    val context: Context,
    val items: List<String?> = mutableListOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding =
            RowPaleoAipRecipesBinding.inflate(LayoutInflater.from(context), parent, false)
        return PaleoAipRecipesViewHolder(context, parent, binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PaleoAipRecipesViewHolder) {
            val paleoAipRecipe = items[position]
            holder.bindView(paleoAipRecipe)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}