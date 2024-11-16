package com.fuad.kidneyfit.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fuad.kidneyfit.R
import com.fuad.kidneyfit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()
    }

    private fun setListener() {
        binding.latarBelakang.setOnClickListener {
            val intent = Intent(this, LatarBelakangActivity::class.java)
            startActivity(intent)
        }

        binding.manfaat.setOnClickListener {
            val intent = Intent(this, ManfaatActivity::class.java)
            startActivity(intent)
        }
    }
}