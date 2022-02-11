package com.a.paleoaiprecipes.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.a.paleoaiprecipes.R
import com.a.paleoaiprecipes.databinding.FragmentPaleoAipRecipesBinding
import java.util.*

class PaleoRecipesFragment(): BaseFragment() {
    lateinit var paleoAipRecipesAdapter: PaleoAipRecipesAdapter
    lateinit var binding: FragmentPaleoAipRecipesBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_paleo_aip_recipes, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPaleoAipRecipesBinding.inflate(layoutInflater)
        initAdapter()
    }

    private fun initAdapter() {
     val itemList: List<String> = listOf("Первое блюдо", "Второе блюдо", "Салаты", "Десерты");
        paleoAipRecipesAdapter =
            PaleoAipRecipesAdapter(
                requireContext(), itemList
            )
        val layoutManager = LinearLayoutManager(requireContext())
        binding.fparPaleoAipRecipesRecyclerView.layoutManager = layoutManager
        binding.fparPaleoAipRecipesRecyclerView.adapter = paleoAipRecipesAdapter
    }
}