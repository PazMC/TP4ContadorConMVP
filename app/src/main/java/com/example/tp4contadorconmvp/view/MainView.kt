package com.example.tp4contadorconmvp.view

import android.app.Activity
import android.widget.Toast
import com.example.tp4contadorconmvp.databinding.ActivityMainBinding
import com.example.tp4contadorconmvp.contract.MainContract

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }



    override fun onButtonPressed(onClick: () -> Unit) {
        binding.toastButton.setOnClickListener { onClick() }
    }

    override fun getText() = binding.editTextUser.text.toString()
}
