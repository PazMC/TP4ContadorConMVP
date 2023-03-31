package com.example.tp4contadorconmvp.contract

interface MainContract {
    interface View {
        fun showToast(text: String)
        fun onButtonPressed(onClick: () -> Unit)

        fun getText(): String
    }

    interface Presenter {
        fun onButtonPressed(text: String)
    }
}
