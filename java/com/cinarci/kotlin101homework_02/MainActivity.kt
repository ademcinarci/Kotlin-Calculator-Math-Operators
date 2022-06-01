package com.cinarci.kotlin101homework_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cinarci.kotlin101homework_02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var islemDeger = null
        var birinciDeger: Int? = null
        var ikinciDeger : Int? = null
        var hangiIslem : Int? = null
        var anlikDeger1: String? = null
        var islemYapildi = false

        binding.numberBir.setOnClickListener {
            if (islemYapildi == true) {

                binding.ekranText.text = "1"
                islemYapildi = false
            } else {

                binding.ekranText.text = binding.ekranText.text.toString() + "1"
            }
        }

        binding.numberIki.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "2"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "2"
        }
        }

        binding.numberUc.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "3"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "3"
        }
        }

        binding.numberDort.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "4"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "4"
        }
        }

        binding.numberBes.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "5"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "5"
        }
        }

        binding.numberAlti.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "6"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "6"
        }
        }

        binding.numberYedi.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "7"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "7"
        }
        }

        binding.numberSekiz.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "8"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "8"
        }
        }

        binding.numberDokuz.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "9"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "9"
        }
        }

        binding.numberSifir.setOnClickListener {if (islemYapildi == true) {

            binding.ekranText.text = "0"
            islemYapildi = false
        } else {

            binding.ekranText.text = binding.ekranText.text.toString() + "0"
        }
        }

        binding.cleanButton.setOnClickListener {
            binding.ekranText.text = ""
            binding.islemText.text = ""
        }

        binding.carpmaButton.setOnClickListener {

                anlikDeger1 = binding.ekranText.text.toString()
                binding.islemText.text = anlikDeger1 + " x"
                binding.ekranText.text = ""
                birinciDeger = anlikDeger1!!.toIntOrNull()
                println("Birinci Değer :  ${birinciDeger}")
                hangiIslem = 1

        }

        binding.bolmeButton.setOnClickListener {

            anlikDeger1 = binding.ekranText.text.toString()
            binding.islemText.text = anlikDeger1 + " /"
            binding.ekranText.text = ""
            birinciDeger = anlikDeger1!!.toIntOrNull()
            println("Birinci Değer :  ${birinciDeger}")
            hangiIslem = 2

        }

        binding.toplamaButton.setOnClickListener {

            anlikDeger1 = binding.ekranText.text.toString()
            binding.islemText.text = anlikDeger1 + " +"
            binding.ekranText.text = ""
            birinciDeger = anlikDeger1!!.toIntOrNull()
            println("Birinci Değer :  ${birinciDeger}")
            hangiIslem = 3

        }

        binding.cikarmaButton.setOnClickListener {

            anlikDeger1 = binding.ekranText.text.toString()
            binding.islemText.text = anlikDeger1 + " -"
            binding.ekranText.text = ""
            birinciDeger = anlikDeger1!!.toIntOrNull()
            println("Birinci Değer :  ${birinciDeger}")
            hangiIslem = 4

        }

        binding.esittirButton.setOnClickListener {
            if (hangiIslem == 1) {
                anlikDeger1 = binding.ekranText.text.toString()
                ikinciDeger = anlikDeger1.toString().toIntOrNull()
                println("İkinci Değer :  ${ikinciDeger}")
                var carpma : Int = (birinciDeger!! * ikinciDeger!!)
                binding.islemText.text = ""
                binding.ekranText.text = carpma.toString()
                islemYapildi = true
            }
            if (hangiIslem == 2) {
                anlikDeger1 = binding.ekranText.text.toString()
                ikinciDeger = anlikDeger1.toString().toIntOrNull()
                println("İkinci Değer :  ${ikinciDeger}")
                var bolme : Float = (birinciDeger!!.toFloat() / ikinciDeger!!.toFloat())
                binding.islemText.text = ""
                binding.ekranText.text = bolme.toString()
                islemYapildi = true
            }
            if (hangiIslem == 3) {
                anlikDeger1 = binding.ekranText.text.toString()
                ikinciDeger = anlikDeger1.toString().toIntOrNull()
                println("İkinci Değer :  ${ikinciDeger}")
                var toplama : Int = (birinciDeger!! + ikinciDeger!!)
                binding.islemText.text = ""
                binding.ekranText.text = toplama.toString()
                islemYapildi = true
            }
            if (hangiIslem == 4) {
                anlikDeger1 = binding.ekranText.text.toString()
                ikinciDeger = anlikDeger1.toString().toIntOrNull()
                println("İkinci Değer :  ${ikinciDeger}")
                var cikarma : Int = (birinciDeger!! - ikinciDeger!!)
                binding.islemText.text = ""
                binding.ekranText.text = cikarma.toString()
                islemYapildi = true
            }
        }
    }

}