package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.myapplication.databinding.ActivityCategoryBinding
import models.Subcategory

class CategoryActivity : AppCompatActivity() {
    lateinit var rvCollections: RecyclerView;

    private val binding by lazy {
        ActivityCategoryBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val receivedIntent = intent
        print(receivedIntent.hasExtra("subcategory"))
        if(receivedIntent.hasExtra("subcategory")) {
            if(Build.VERSION.SDK_INT >= 33) {
                val subcategory = receivedIntent.getSerializableExtra("subcategory", Subcategory::class.java)
                //binding.categoryName.text = subcategory?.name
                binding.toolbarTitle.text = subcategory?.name;
                binding.buttonPrev.setOnClickListener {
                    finish()
                }
                if(subcategory?.collections != null) {
                    rvCollections = findViewById(R.id.rv_collections);
                    rvCollections.adapter = CollectionAdapter(subcategory.collections);
                    rvCollections.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
                }
            } else {
                val subcategory = receivedIntent.getSerializableExtra("subcategory") as Subcategory
                //binding.categoryName.text = subcategory?.name
                binding.toolbarTitle.text = subcategory?.name;
                binding.buttonPrev.setOnClickListener {
                    finish()
                }
                if(subcategory?.collections != null) {
                    rvCollections = findViewById(R.id.rv_collections);
                    rvCollections.adapter = CollectionAdapter(subcategory.collections);
                    rvCollections.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
                }
            }
        }


    }
}