package com.fuad.kidneyfit.ui

import android.os.Build
import android.os.Bundle
import android.text.Layout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fuad.kidneyfit.R
import com.fuad.kidneyfit.databinding.ActivityLatarBelakangBinding

class LatarBelakangActivity : AppCompatActivity() {

    lateinit var binding: ActivityLatarBelakangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatarBelakangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.materiLatarBelakang.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
        }

        binding.backBtn.setOnClickListener {
            finish()
        }
    }
}