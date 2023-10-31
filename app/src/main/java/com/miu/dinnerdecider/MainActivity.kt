package com.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.miu.dinnerdecider.databinding.DinnerMenuBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: DinnerMenuBinding
    private val menu: MutableList<String> =
        mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DinnerMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun addFoodClick(view: View) {
        val newDish: String = binding.foodTxt.text.toString()
        menu.add(newDish)
        binding.heading.text = newDish
    }

    fun decideClick(view: View) {
        val index = Random().nextInt(menu.size)
        binding.heading.text = menu[index]
    }
}