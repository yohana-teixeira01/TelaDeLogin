package com.example.teladelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teladelogin.databinding.ActivityLoginErradoBinding

class LoginErradoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginErradoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErradoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener {
           finish()
        }
    }
}