package ru.techmas.logistCalc.activities

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.Toolbar
import com.arellomobile.mvp.MvpAppCompatActivity
import ru.techmas.logistCalc.R

/**
 * Created by reg on 22.04.2017.
 */
open class BaseActivity : MvpAppCompatActivity() {


    protected fun hideKeyboard() {

    }


    protected open fun setupBackButton(toolbar: Toolbar) {
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { finish() }
    }

    inline public fun <reified T : Activity> showActivity() {
        startActivity(Intent(this, T::class.java))
        overridePendingTransition(R.anim.no_animation, R.anim.no_animation)
    }

    inline public fun <reified T : Activity> showActivityWithTransition() {
        startActivity(Intent(this, T::class.java))
        overridePendingTransition(R.anim.move_right_in_activity, R.anim.move_left_out_activity)
    }


    override open fun finish() {
        super.finish()
        overridePendingTransition(R.anim.no_animation, R.anim.no_animation)
    }

    override fun onBackPressed() {
        finish()
    }
}