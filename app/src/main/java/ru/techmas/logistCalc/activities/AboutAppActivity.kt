package ru.techmas.logistCalc.activities

import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*
import ru.techmas.logistCalc.R

class AboutAppActivity : BaseActivity() {


    val LAYOUT = R.layout.activity_about_app

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
        setupToolbar()
    }


    private fun setupToolbar() {
        toolbar.title = getString(R.string.main_menu_about)
        setupBackButton(toolbar)
    }
}
