package com.example.tp4contadorconmvp.mvp.model

import com.example.tp4contadorconmvp.mvp.contract.CountContract
import com.example.tp4contadorconmvp.util.Constants.ZERO

class CountModel : CountContract.Model {

    private var count = ZERO

    override fun getCount(): String {
        return count.toString()
    }

    override fun reset() {
        count = ZERO
    }

    override fun inc(inputNumber: String) {
        count += inputNumber.toInt()
    }

    override fun dec(inputNumber: String) {
        count -= inputNumber.toInt()
    }
}
