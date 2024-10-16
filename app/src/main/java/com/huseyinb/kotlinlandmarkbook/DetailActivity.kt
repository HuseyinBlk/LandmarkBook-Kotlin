package com.huseyinb.kotlinlandmarkbook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.huseyinb.kotlinlandmarkbook.databinding.ActivityDetailBinding
import com.huseyinb.kotlinlandmarkbook.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //casting

        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.landmarkText.text = selectedLandmark.name
        binding.countryText.text = selectedLandmark.country
        binding.landImage.setImageResource(selectedLandmark.image)
    }
}