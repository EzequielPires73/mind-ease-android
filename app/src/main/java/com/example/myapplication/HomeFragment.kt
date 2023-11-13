package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import repositories.CategoryRepository

class HomeFragment : Fragment() {
    val categoryRepository = CategoryRepository()
    private lateinit var rvDestaques: RecyclerView
    private lateinit var rvRespiracao: RecyclerView
    private lateinit var rvSongs: RecyclerView
    private lateinit var rvMindfulness: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val subcategories01 = categoryRepository.categories[0].subcategories
        rvDestaques = view.findViewById(R.id.rv_destaques)
        rvDestaques.adapter = SubcategoryAdapter(subcategories01 ?: emptyList(), R.color.primary)

        val subcategories02 = categoryRepository.categories[1].subcategories
        rvRespiracao = view.findViewById(R.id.rv_respiracao)
        rvRespiracao.adapter = SubcategoryAdapter(subcategories02 ?: emptyList(), R.color.red)

        val subcategories03 = categoryRepository.categories[2].subcategories
        rvSongs = view.findViewById(R.id.rv_songs)
        rvSongs.adapter = SubcategoryAdapter(subcategories03 ?: emptyList(), R.color.blue)

        val subcategories04 = categoryRepository.categories[3].subcategories
        rvMindfulness = view.findViewById(R.id.rv_mindfulness)
        rvMindfulness.adapter = SubcategoryAdapter(subcategories04 ?: emptyList(), R.color.yellow)

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {}
    }
}