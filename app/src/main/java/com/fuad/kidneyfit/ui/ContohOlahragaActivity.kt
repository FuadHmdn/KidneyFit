package com.fuad.kidneyfit.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fuad.kidneyfit.R
import com.fuad.kidneyfit.databinding.ActivityContohOlahragaBinding

class ContohOlahragaActivity : AppCompatActivity() {

    lateinit var binding: ActivityContohOlahragaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContohOlahragaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContent()
        setListener()
    }

    private fun setListener() {
        binding.backBtn.setOnClickListener {
            finish()
        }
    }

    private fun setContent() {
        val jalanKaki = getString(R.string.jalan_kaki_isi)
        val bersepeda = getString(R.string.bersepeda_isi)
        val renang = getString(R.string.renang_isi)
        val yoga = getString(R.string.yoga_isi)
        val senamAerobik = getString(R.string.senam_aerobik_isi)
        val taiChi = getString(R.string.tai_chi_isi)
        val jogging = getString(R.string.jogging_isi)
        val latihanKetahanan = getString(R.string.latihan_ketahanan_isi)
        val mendaki = getString(R.string.mendaki_isi)
        val stretching = getString(R.string.stretching_isi)

        binding.jalanKakiIsi.text = HtmlCompat.fromHtml(jalanKaki, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.bersepedaIsi.text = HtmlCompat.fromHtml(bersepeda, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.renangIsi.text = HtmlCompat.fromHtml(renang, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.yogaIsi.text = HtmlCompat.fromHtml(yoga, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.senamAerobikIsi.text = HtmlCompat.fromHtml(senamAerobik, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.taiChiIsi.text = HtmlCompat.fromHtml(taiChi, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.joggingIsi.text = HtmlCompat.fromHtml(jogging, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.latihanKetahananIsi.text = HtmlCompat.fromHtml(latihanKetahanan, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.mendakiIsi.text = HtmlCompat.fromHtml(mendaki, HtmlCompat.FROM_HTML_MODE_LEGACY)
        binding.stretchingIsi.text = HtmlCompat.fromHtml(stretching, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}