package com.sfu.diplomkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sfu.diplomkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()


    }

    private fun onClick(){
        binding.btnAttantion.setOnClickListener {
            val intent = Intent(this, Attention::class.java)
            startActivity(intent)
        }

        binding.btnReact.setOnClickListener {
            val intent = Intent(this, MemoryAlt::class.java)
            startActivity(intent)
        }
    }

}