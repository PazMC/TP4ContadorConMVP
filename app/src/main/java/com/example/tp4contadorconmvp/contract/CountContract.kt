package com.example.tp4contadorconmvp.contract

interface CountContract {

    interface Model {
        fun getCount(): String
        fun reset()
        fun inc()
        fun dec()
    }
    interface View {
        fun getNumber(): Int
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
