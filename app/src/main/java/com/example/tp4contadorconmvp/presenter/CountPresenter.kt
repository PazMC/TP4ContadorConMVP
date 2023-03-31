package com.example.tp4contadorconmvp.presenter

import com.example.tp4contadorconmvp.contract.CountContract

class CountPresenter(private val model: CountContract.Model, private val view: CountContract.View) : CountContract.Presenter {
    init {
        view.onIncreaseButtonPressed { onIncreaseButtonPressed(view.getText()) }
        view.onDecreaseButtonPressed { onDecreaseButtonPressed(view.getText()) }
        view.onResetButtonPressed { onResetButtonPressed() }
    }

    override fun onIncreaseButtonPressed() {
        model.inc()
        view.setCount(model.getCount())
    }
    //TODO
    /*
    override fun onDecreaseButtonPressed() {
        model.dec()
        view.setCount(model.getCount())
    }*/

    override fun onResetButtonPressed() {
        model.reset()
        view.setCount(model.getCount())
    }
}