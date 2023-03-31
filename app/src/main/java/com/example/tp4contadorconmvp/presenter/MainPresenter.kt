package com.example.tp4contadorconmvp.presenter

import com.example.tp4contadorconmvp.contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    init {
        view.onIncreaseButtonPressed { onIncreaseButtonPressed(view.getText()) }
    }

    override fun onButtonPressed(text: String) {
        view.showToast(text)
    }
}
