package ru.techmas.logistCalc.activities

import android.support.v7.widget.Toolbar
import ru.techmas.logistCalc.R

/**
 * Date: 22.04.2017
 * Time: 18:45
 * Project: LogistCalc
 *
 * @author Alex Bykov
 * You can contact me at me@alexbykov.ru
 */
open class BaseFieldActivity : BaseActivity() {


    protected override fun setupBackButton(toolbar: Toolbar) {
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }


    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.move_left_in_activity, R.anim.move_right_out_activity)
    }


}