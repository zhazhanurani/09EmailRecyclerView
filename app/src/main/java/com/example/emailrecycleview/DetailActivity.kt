package com.example.emailrecycleview

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.emailrecycleview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve data from Intent
        val name = intent.getStringExtra("Name")
        val date = intent.getStringExtra("date")
        val description = intent.getStringExtra("description")

        // Set data to views
        binding.Name.text = name
        binding.date.text = date
        binding.emailContent.text = description

        // Back button functionality
        binding.backButton.setOnClickListener {
            finish()
        }
    }
}
