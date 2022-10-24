package com.sfu.diplomkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.sfu.diplomkotlin.databinding.ActivityAttentionBinding

class Attention : AppCompatActivity() {

    private lateinit var binding: ActivityAttentionBinding
    private var count = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAttentionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewDigit.text = "$count"

        setRandomDigits()

        binding.apply {
            button0.setOnClickListener { onClick(button0) }
            button1.setOnClickListener { onClick(button1) }
            button2.setOnClickListener { onClick(button2) }
            button3.setOnClickListener { onClick(button3) }
            button4.setOnClickListener { onClick(button4) }
            button5.setOnClickListener { onClick(button5) }
            button6.setOnClickListener { onClick(button6) }
            button7.setOnClickListener { onClick(button7) }
            button8.setOnClickListener { onClick(button8) }
            button9.setOnClickListener { onClick(button9) }
            button10.setOnClickListener { onClick(button10) }
            button11.setOnClickListener { onClick(button11) }
            button12.setOnClickListener { onClick(button12) }
            button13.setOnClickListener { onClick(button13) }
            button14.setOnClickListener { onClick(button14) }
            button15.setOnClickListener { onClick(button15) }
            button16.setOnClickListener { onClick(button16) }
            button17.setOnClickListener { onClick(button17) }
            button18.setOnClickListener { onClick(button18) }
            button19.setOnClickListener { onClick(button19) }
            button20.setOnClickListener { onClick(button20) }
            button21.setOnClickListener { onClick(button21) }
            button22.setOnClickListener { onClick(button22) }
            button23.setOnClickListener { onClick(button23) }
            button24.setOnClickListener { onClick(button24) }
        }


    }

    //  Такого в оригинально работе не было, так что эксперементы!
    private fun onClick(button : Button){
        if (button.text == count.toString())
            updateBtn()
        else
            Toast.makeText(this, "Вы ошиблись, попробуйте еще раз!", Toast.LENGTH_SHORT).show()
    }


    //    Данный метод отнял у меня часа 3.
    //    В Java этот момент как то легче дался, хотя и функция была нагромождена
    private fun setRandomDigits() {
        val array = Array(25) { 0 }
        for (i in array.indices) {
            array[i] = i + 1
        }
        array.shuffle()

        binding.apply {
            button0.text = array[0].toString()
            button1.text = array[1].toString()
            button2.text = array[2].toString()
            button3.text = array[3].toString()
            button4.text = array[4].toString()
            button5.text = array[5].toString()
            button6.text = array[6].toString()
            button7.text = array[7].toString()
            button8.text = array[8].toString()
            button9.text = array[9].toString()
            button10.text = array[10].toString()
            button11.text = array[11].toString()
            button12.text = array[12].toString()
            button13.text = array[13].toString()
            button14.text = array[14].toString()
            button15.text = array[15].toString()
            button16.text = array[16].toString()
            button17.text = array[17].toString()
            button18.text = array[18].toString()
            button19.text = array[19].toString()
            button20.text = array[20].toString()
            button21.text = array[21].toString()
            button22.text = array[22].toString()
            button23.text = array[23].toString()
            button24.text = array[24].toString()

        }
    }

    private fun updateBtn() {
        count++
        binding.textViewDigit.text = "$count"
        setRandomDigits()
        if (count > 25) {
            disableBtn()
            binding.textExplain2.visibility = View.GONE
            binding.textViewDigit.visibility = View.GONE
            Toast.makeText(
                this, "Тренажер пройден! Поздравляем!", Toast.LENGTH_SHORT
            ).show()

        }
    }

    private fun disableBtn() {
        binding.apply {
            button0.isEnabled = false
            button1.isEnabled = false
            button2.isEnabled = false
            button3.isEnabled = false
            button4.isEnabled = false
            button5.isEnabled = false
            button6.isEnabled = false
            button7.isEnabled = false
            button8.isEnabled = false
            button9.isEnabled = false
            button10.isEnabled = false
            button11.isEnabled = false
            button12.isEnabled = false
            button13.isEnabled = false
            button14.isEnabled = false
            button15.isEnabled = false
            button16.isEnabled = false
            button17.isEnabled = false
            button18.isEnabled = false
            button19.isEnabled = false
            button20.isEnabled = false
            button21.isEnabled = false
            button22.isEnabled = false
            button23.isEnabled = false
            button24.isEnabled = false
        }
    }
}