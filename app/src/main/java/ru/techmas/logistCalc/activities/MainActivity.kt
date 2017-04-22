package ru.techmas.logistCalc.activities

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.reg.androidKotlinTemplate.mvp.views.MainActivityView
import ru.techmas.logistCalc.R
import ru.techmas.logistCalc.mvp.presenters.MainActivityPresenter


class MainActivity : BaseActivity(), MainActivityView {


    val LAYOUT = R.layout.activity_main

    @InjectPresenter lateinit var mainActivityPresenter: MainActivityPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
    }


}
