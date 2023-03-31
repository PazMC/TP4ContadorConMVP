package com.example.tp4contadorconmvp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tp4contadorconmvp.R
import com.example.tp4contadorconmvp.model.CountModel
import com.example.tp4contadorconmvp.presenter.CountPresenter
import com.example.tp4contadorconmvp.view.CountView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CountPresenter(CountModel(), CountView(this))
    }
}
