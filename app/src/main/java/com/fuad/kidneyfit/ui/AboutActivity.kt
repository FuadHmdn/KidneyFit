package com.fuad.kidneyfit.ui

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fuad.kidneyfit.R
import com.fuad.kidneyfit.databinding.ActivityAboutBinding
import com.fuad.kidneyfit.databinding.ActivityManfaatBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContent()
        setListener()
    }

    private fun setListener() {
        binding.btnLanjutkan.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }
    }

    private fun setContent() {
//        ObjectAnimator.ofFloat(binding.img, View.TRANSLATION_X, -30f, 30f).apply {
//            duration = 6000
//            repeatCount = ObjectAnimator.INFINITE
//            repeatMode = ObjectAnimator.REVERSE
//        }.start()

        val welcome = ObjectAnimator.ofFloat(binding.welcome, View.ALPHA, 1f).setDuration(700)
        val about = ObjectAnimator.ofFloat(binding.about, View.ALPHA, 1f).setDuration(700)
        val dibuat = ObjectAnimator.ofFloat(binding.dibuatOleh, View.ALPHA, 1f).setDuration(700)
        val img = ObjectAnimator.ofFloat(binding.img2, View.ALPHA, 1f).setDuration(700)
        val nama = ObjectAnimator.ofFloat(binding.nama, View.ALPHA, 1f).setDuration(700)
        val npm = ObjectAnimator.ofFloat(binding.npm, View.ALPHA, 1f).setDuration(700)
        val button = ObjectAnimator.ofFloat(binding.btnLanjutkan, View.ALPHA, 1f).setDuration(700)

        val together = AnimatorSet().apply {
            playTogether(img, nama, npm)
        }

        AnimatorSet().apply {
            playSequentially(welcome, about, dibuat, together, button)
            start()
        }
    }
}