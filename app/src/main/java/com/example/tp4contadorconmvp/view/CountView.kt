package com.example.tp4contadorconmvp.view

import android.app.Activity
import com.example.tp4contadorconmvp.contract.CountContract
import com.example.tp4contadorconmvp.databinding.ActivityMainBinding
import com.example.tp4contadorconmvp.view.base.ActivityView

class CountView(activity: Activity) : ActivityView(activity), CountContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun getNumber() = binding.editTextUser.text

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
