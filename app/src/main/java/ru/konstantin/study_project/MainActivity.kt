package ru.konstantin.study_project

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import konstantin.lesson1.MainPresenter
import konstantin.lesson1.MainView
import ru.konstantin.study_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var mainBinding: ActivityMainBinding

    private val presenter = MainPresenter()

    private var buttonNumber: Counters = Counters.FIRST

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        val listener = View.OnClickListener {
            when(it.id) {
                R.id.btn_counter1 -> buttonNumber = Counters.FIRST
                R.id.btn_counter2 -> buttonNumber = Counters.SECOND
                R.id.btn_counter3 -> buttonNumber = Counters.THIRD
            }
            this.setButtonText(buttonNumber, presenter.counterClick(buttonNumber))
        }

        mainBinding.btnCounter1.setOnClickListener(listener)
        mainBinding.btnCounter2.setOnClickListener(listener)
        mainBinding.btnCounter3.setOnClickListener(listener)
    }

    override fun setButtonText(buttonNumber: Counters, text: String) {
        when (buttonNumber) {
            Counters.FIRST -> mainBinding.btnCounter1.text = text
            Counters.SECOND -> mainBinding.btnCounter2.text = text
            Counters.THIRD -> mainBinding.btnCounter3.text = text
        }
    }
}