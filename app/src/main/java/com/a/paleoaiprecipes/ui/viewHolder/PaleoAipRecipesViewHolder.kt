package com.a.paleoaiprecipes.ui.viewHolder

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.a.paleoaiprecipes.R
import com.a.paleoaiprecipes.databinding.RowPaleoAipRecipesBinding

class PaleoAipRecipesViewHolder (val context: Context, parent: ViewGroup,
                                 val binding: RowPaleoAipRecipesBinding)
    : BaseViewHolder(R.layout.row_paleo_aip_recipes, parent) {


    fun bindView(item: String?) {
        binding.rparPaleoAipNameTextView.text = item
    }
}