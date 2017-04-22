package ru.techmas.logistCalc.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.toolbar.*
import ru.techmas.logistCalc.R

class AboutAppActivity : AppCompatActivity() {


    val LAYOUT = R.layout.activity_about_app

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
        toolbar.title = getString(R.string.main_menu_about)
    }
}
