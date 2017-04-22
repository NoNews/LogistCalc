package ru.techmas.logistCalc.activities

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*
import ru.techmas.logistCalc.R

class SettingsActivity : BaseActivity() {

    val LAYOUT = R.layout.activity_settings
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
        toolbar.title = getString(R.string.main_menu_settings)
    }
}
