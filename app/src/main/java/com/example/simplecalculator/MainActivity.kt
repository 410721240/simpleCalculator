package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        binding.plus.setOnClickListener{
            add(it)
        }
        binding.minus.setOnClickListener {
            minus(it)
        }
        binding.multiply.setOnClickListener {
            mul(it)
        }
        binding.divide.setOnClickListener {
            div(it)
        }
    }
    private fun add(view: View){
        //var numb1 = binding.num1
        //var numb2 = binding.num2
        binding.apply {
            var sum: Double = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            result.text = sum.toString()
        }
    }
    private fun minus(view: View){
        binding.apply {
            var sum: Double = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            result.text = sum.toString()
        }
    }
    private fun mul(view: View){
        binding.apply {
            var sum: Double = num1.text.toString().toDouble() * num2.text.toString().toDouble()
            result.text = sum.toString()
        }
    }
    private fun div(view: View){
        binding.apply {
            var sum: Double = num1.text.toString().toDouble() / num2.text.toString().toDouble()
            result.text = sum.toString()
        }
    }
}