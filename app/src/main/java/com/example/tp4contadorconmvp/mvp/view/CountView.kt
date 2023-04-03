package com.example.tp4contadorconmvp.mvp.view

import android.app.Activity
import com.example.tp4contadorconmvp.databinding.ActivityMainBinding
import com.example.tp4contadorconmvp.mvp.contract.CountContract
import com.example.tp4contadorconmvp.mvp.view.base.ActivityView

class CountView(activity: Activity) : ActivityView(activity), CountContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun inputNumber(): String {
        return binding.numberUser.text.toString()
    }

    override fun setCount(count: String) {
        binding.counterResult.text = count
    }

    override fun onIncreaseButtonPressed(onClick: () -> Unit) {
        binding.increaseButton.setOnClickListener { onClick() }
    }

    override fun onDecreaseButtonPressed(onClick: () -> Unit) {
        binding.decreaseButton.setOnClickListener { onClick() }
    }

    override fun onResetButtonPressed(onClick: () -> Unit) {
        binding.resetButton.setOnClickListener { onClick() }
    }
}
