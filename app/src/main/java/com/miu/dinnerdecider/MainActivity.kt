package com.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.miu.dinnerdecider.databinding.DinnerMenuBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: DinnerMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DinnerMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun click(view: View) {
        binding.heading.text = "Hello Kotlin World"
    }
}