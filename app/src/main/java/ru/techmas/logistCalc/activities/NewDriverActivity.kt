package ru.techmas.logistCalc.activities

import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*
import ru.techmas.logistCalc.R

class NewDriverActivity : BaseActivity() {

    val LAYOUT = R.layout.activity_new_driver;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
        setupToolbar()
    }


    private fun setupToolbar() {
        toolbar.title = getString(R.string.activity_new_driver)
        setupBackButton(toolbar)
    }

}
