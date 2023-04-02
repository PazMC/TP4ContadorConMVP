package com.example.tp4contadorconmvp.model

import com.example.tp4contadorconmvp.contract.CountContract
import com.example.tp4contadorconmvp.util.Constants.ZERO

class CountModel : CountContract.Model {

    private var count = ZERO
    private var currentValue = 0
    override fun getCount(): String = count.toString()

    override fun reset() {
        count = ZERO
    }

    override fun inc() {
        currentValue = getCount().toInt()
        count += currentValue
    }

    override fun dec() {
        currentValue = getCount().toInt()
        count -= currentValue
    }
}
