package com.sfu.diplomkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sfu.diplomkotlin.databinding.ActivityMemoryAltBinding

class MemoryAlt : AppCompatActivity() {

    private lateinit var binding: ActivityMemoryAltBinding
    private var posCount = 0
    private var negCount = 0
    private var count = 0
    private val arr = Array(30) { 0 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMemoryAltBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillArray()
        binding.textNumber.text = arr[0].toString()
        binding.btnNo.isEnabled = false
        binding.btnYes.isEnabled = false

        binding.btnRdy.setOnClickListener { onClick(0) }
        binding.btnYes.setOnClickListener { onClick(1) }
        binding.btnNo.setOnClickListener { onClick(2) }

    }

    private fun onClick (buttonId : Int){
        binding.apply {
            when (buttonId) {
                0 -> {
                    btnNo.isEnabled = true
                    btnYes.isEnabled = true
                    btnRdy.isEnabled = false
                    btnRdy.visibility = View.INVISIBLE
                    count++
                    textNumber.text = arr[count].toString()
                }
                1 -> {
                    if (arr[count] == arr[count - 1]) {
                        posCount++
                    } else {
                        negCount++
                    }
                    checking()
                }
                2 -> {
                    if (arr[count] != arr[count - 1]) {
                        posCount++
                    } else {
                        negCount++
                    }
                    checking()
                }
            }
        }
    }

    private fun fillArray() {
        val num = Array(5) { 0 }
        for (i in num.indices)
            num[i] = (1..100).random()

        for (i in arr.indices)
            arr[i] = num[(num.indices).random()]
    }

    private fun checking(){
        when (count){
            in 0..25 -> {
                count++
                binding.textNumber.text = arr[count].toString()
            }
            else -> {
                binding.apply {
                    btnNo.isEnabled = false
                    btnYes.isEnabled = false
                    textPosCount.text = posCount.toString()
                    textNegCount.text = negCount.toString()
                    textPosCount.visibility = View.VISIBLE
                    textNegCount.visibility = View.VISIBLE
                    textPosEx.visibility = View.VISIBLE
                    textNegEx.visibility = View.VISIBLE
                }
            }
        }
    }


}