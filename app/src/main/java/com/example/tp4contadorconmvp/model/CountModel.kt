package com.example.tp4contadorconmvp.model

import com.example.tp4contadorconmvp.contract.CountContract

class CountModel : CountContract.Model {

    private var count = ZERO

    override fun getCount(): String = count.toString()

    override fun reset() {
        count = ZERO
    }

    override fun inc() {
        count += ONE
    }
    override fun dec() {
        count +=
    }
}
