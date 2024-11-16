package com.fuad.kidneyfit.ui

import android.os.Build
import android.os.Bundle
import android.text.Layout
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import com.fuad.kidneyfit.R
import com.fuad.kidneyfit.databinding.ActivityManfaatBinding

class ManfaatActivity : AppCompatActivity() {

    lateinit var binding: ActivityManfaatBinding
    var m1 = true
    var m2 = false
    var m3 = false
    var m4 = false
    var m5 = false
    var m6 = false
    var m7 = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManfaatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContent()
        setListener()
    }

    private fun setContent() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.materi1.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi2.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi3.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi31.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi32.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi33.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi4.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi5.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi6.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi7.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi72.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi73.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi74.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi75.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi76.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi77.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi78.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi79.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
            binding.materi710.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
        }

        val olahragaAerobikText = getString(R.string.olahraga_aerobik)
        val latihanKekuatanText = getString(R.string.latihan_kekuatan)
        val latihanHiitText = getString(R.string.hiit)

        binding.materi31.text =
            HtmlCompat.fromHtml(olahragaAerobikText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi32.text =
            HtmlCompat.fromHtml(latihanKekuatanText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi33.text =
            HtmlCompat.fromHtml(latihanHiitText, HtmlCompat.FROM_HTML_MODE_LEGACY)

        val yogaText = getString(R.string.yoga)
        val lariText = getString(R.string.lari)
        val bersepedaText = getString(R.string.bersepeda)
        val renangText = getString(R.string.renang)
        val pilatesText = getString(R.string.pilates)
        val taichiText = getString(R.string.tai_chi)
        val zumbaText = getString(R.string.zumba)
        val olahragaTimText = getString(R.string.olahraga_tim)
        val hikingText = getString(R.string.hiking)
        val kardioRinganText = getString(R.string.latihan_kardio_ringan)

        binding.materi71.text =
            HtmlCompat.fromHtml(yogaText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi72.text =
            HtmlCompat.fromHtml(lariText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi73.text =
            HtmlCompat.fromHtml(bersepedaText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi74.text =
            HtmlCompat.fromHtml(renangText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi75.text =
            HtmlCompat.fromHtml(pilatesText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi76.text =
            HtmlCompat.fromHtml(taichiText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi77.text =
            HtmlCompat.fromHtml(zumbaText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi78.text =
            HtmlCompat.fromHtml(olahragaTimText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi79.text =
            HtmlCompat.fromHtml(hikingText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.materi710.text =
            HtmlCompat.fromHtml(kardioRinganText, HtmlCompat.FROM_HTML_MODE_LEGACY)

    }

    private fun setListener() {

        binding.backBtn.setOnClickListener {
            finish()
        }

        binding.btnM1.setOnClickListener {
            if (m1) {
                m1 = false
                binding.img1.visibility = View.GONE
                binding.materi1.visibility = View.GONE
                binding.btnM1.setImageResource(R.drawable.ic_arrow_forward_ios_24)
            } else {
                m1 = true
                binding.img1.visibility = View.VISIBLE
                binding.materi1.visibility = View.VISIBLE
                binding.btnM1.setImageResource(R.drawable.ic_keyboard_arrow_down_24)
            }
        }

        binding.btnM2.setOnClickListener {
            if (m2) {
                m2 = false
                binding.img2.visibility = View.GONE
                binding.materi2.visibility = View.GONE
                binding.btnM2.setImageResource(R.drawable.ic_arrow_forward_ios_24)
            } else {
                m2 = true
                binding.img2.visibility = View.VISIBLE
                binding.materi2.visibility = View.VISIBLE
                binding.btnM2.setImageResource(R.drawable.ic_keyboard_arrow_down_24)
            }
        }
        binding.btnM3.setOnClickListener {
            if (m3) {
                m3 = false
                binding.materi3.visibility = View.GONE
                binding.materi31.visibility = View.GONE
                binding.materi32.visibility = View.GONE
                binding.materi33.visibility = View.GONE
                binding.btnM3.setImageResource(R.drawable.ic_arrow_forward_ios_24)
            } else {
                m3 = true
                binding.materi3.visibility = View.VISIBLE
                binding.materi31.visibility = View.VISIBLE
                binding.materi32.visibility = View.VISIBLE
                binding.materi33.visibility = View.VISIBLE
                binding.btnM3.setImageResource(R.drawable.ic_keyboard_arrow_down_24)
            }
        }
        binding.btnM4.setOnClickListener {
            if (m4) {
                m4 = false
                binding.img4.visibility = View.GONE
                binding.materi4.visibility = View.GONE
                binding.btnM4.setImageResource(R.drawable.ic_arrow_forward_ios_24)
            } else {
                m4 = true
                binding.img4.visibility = View.VISIBLE
                binding.materi4.visibility = View.VISIBLE
                binding.btnM4.setImageResource(R.drawable.ic_keyboard_arrow_down_24)
            }
        }
        binding.btnM5.setOnClickListener {
            if (m5) {
                m5 = false
                binding.img5.visibility = View.GONE
                binding.materi5.visibility = View.GONE
                binding.btnM5.setImageResource(R.drawable.ic_arrow_forward_ios_24)
            } else {
                m5 = true
                binding.img5.visibility = View.VISIBLE
                binding.materi5.visibility = View.VISIBLE
                binding.btnM5.setImageResource(R.drawable.ic_keyboard_arrow_down_24)
            }
        }
        binding.btnM6.setOnClickListener {
            if (m6) {
                m6 = false
                binding.img6.visibility = View.GONE
                binding.materi6.visibility = View.GONE
                binding.btnM6.setImageResource(R.drawable.ic_arrow_forward_ios_24)
            } else {
                m6 = true
                binding.img6.visibility = View.VISIBLE
                binding.materi6.visibility = View.VISIBLE
                binding.btnM6.setImageResource(R.drawable.ic_keyboard_arrow_down_24)
            }
        }
        binding.btnM7.setOnClickListener {
            if (m7) {
                m7 = false
                binding.materi7.visibility = View.GONE
                binding.materi71.visibility = View.GONE
                binding.materi72.visibility = View.GONE
                binding.materi73.visibility = View.GONE
                binding.materi74.visibility = View.GONE
                binding.materi75.visibility = View.GONE
                binding.materi76.visibility = View.GONE
                binding.materi77.visibility = View.GONE
                binding.materi78.visibility = View.GONE
                binding.materi79.visibility = View.GONE
                binding.materi710.visibility = View.GONE
                binding.btnM7.setImageResource(R.drawable.ic_arrow_forward_ios_24)
            } else {
                m7 = true
                binding.materi7.visibility = View.VISIBLE
                binding.materi71.visibility = View.VISIBLE
                binding.materi72.visibility = View.VISIBLE
                binding.materi73.visibility = View.VISIBLE
                binding.materi74.visibility = View.VISIBLE
                binding.materi75.visibility = View.VISIBLE
                binding.materi76.visibility = View.VISIBLE
                binding.materi77.visibility = View.VISIBLE
                binding.materi78.visibility = View.VISIBLE
                binding.materi79.visibility = View.VISIBLE
                binding.materi710.visibility = View.VISIBLE
                binding.btnM7.setImageResource(R.drawable.ic_keyboard_arrow_down_24)
            }
        }
    }
}