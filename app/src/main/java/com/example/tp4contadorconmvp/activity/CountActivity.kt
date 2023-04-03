package com.example.tp4contadorconmvp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tp4contadorconmvp.mvp.model.CountModel
import com.example.tp4contadorconmvp.mvp.presenter.CountPresenter
import com.example.tp4contadorconmvp.mvp.view.CountView

class CountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CountPresenter(CountModel(), CountView(this))
    }
}
