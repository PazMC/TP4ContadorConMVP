package com.example.tp4contadorconmvp.mvp.contract

interface CountContract {

    interface Model {
        fun getCount(): String
        fun reset()
        fun inc(inputNumber: String)
        fun dec(inputNumber: String)
    }
    interface View {
        fun inputNumber(): String
        fun setCount(count: String)
        fun onIncreaseButtonPressed(onClick: () -> Unit)
        fun onDecreaseButtonPressed(onClick: () -> Unit)
        fun onResetButtonPressed(onClick: () -> Unit)
    }

    interface Presenter {
        fun onIncreaseButtonPressed()
        fun onDecreaseButtonPressed()
        fun onResetButtonPressed()
    }
}
