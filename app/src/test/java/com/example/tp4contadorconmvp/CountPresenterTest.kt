package com.example.tp4contadorconmvp

import com.example.tp4contadorconmvp.mvp.contract.CountContract
import com.example.tp4contadorconmvp.mvp.presenter.CountPresenter
import com.example.tp4contadorconmvp.util.Constants.ZERO
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class CountPresenterTest {

    private lateinit var presenter: CountContract.Presenter
    private val model: CountContract.Model = mockk()
    private val view: CountContract.View = mockk()

    @Before
    fun setup() {
        presenter = CountPresenter(model, view)
        every { view.onIncreaseButtonPressed(any()) } just runs
        every { view.onDecreaseButtonPressed { any() } } just runs
        every { view.onResetButtonPressed { any() } } just runs
    }

    @Test
    fun `on increase button pressed, increments the value of inputNumber to the count`() {
        val inputNumber = 5
        val count = inputNumber.toString()
        every { (model.getCount()) } returns count

        presenter.onIncreaseButtonPressed()

        verify { model.inc(inputNumber.toString()) }
        verify { model.getCount() }
        verify { view.setCount(count) }
    }

    @Test
    fun `on decrease button pressed, decrements the value of inputNumber to the count`() {
        val inputNumber = 3
        val count = inputNumber.toString()
        every { (model.getCount()) } returns count

        presenter.onDecreaseButtonPressed()

        verify { model.dec(inputNumber.toString()) }
        verify { model.getCount() }
        verify { view.setCount(count) }
    }

    @Test
    fun `on reset button pressed, the count value is reset to zero`() {
        val countResetValue = ZERO.toString()
        every { model.getCount() } returns countResetValue

        presenter.onResetButtonPressed()

        verify { model.reset() }
        verify { model.getCount() }
        verify { view.setCount(countResetValue) }
    }
}
