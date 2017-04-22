package ru.techmas.logistCalc.activities

import android.os.Bundle

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showActivity<MainActivity>()
    }
}
