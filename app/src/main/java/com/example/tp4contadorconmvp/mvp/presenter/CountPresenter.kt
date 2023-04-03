package com.example.tp4contadorconmvp.mvp.presenter

import com.example.tp4contadorconmvp.mvp.contract.CountContract

class CountPresenter(private val model: CountContract.Model, private val view: CountContract.View) :
    CountContract.Presenter {
    init {
        view.onIncreaseButtonPressed { onIncreaseButtonPressed() }
        view.onDecreaseButtonPressed { onDecreaseButtonPressed() }
        view.onResetButtonPressed { onResetButtonPressed() }
    }

    override fun onIncreaseButtonPressed() {
        model.inc(view.inputNumber())
        view.setCount(model.getCount())
    }

    override fun onDecreaseButtonPressed() {
        model.dec(view.inputNumber())
        view.setCount(model.getCount())
    }

    override fun onResetButtonPressed() {
        model.reset()
        view.setCount(model.getCount())
    }
}
