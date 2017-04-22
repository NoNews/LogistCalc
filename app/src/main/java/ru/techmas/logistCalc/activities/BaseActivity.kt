package ru.techmas.logistCalc.activities

import android.app.Activity
import android.content.Intent
import com.arellomobile.mvp.MvpAppCompatActivity

/**
 * Created by reg on 22.04.2017.
 */
open class BaseActivity : MvpAppCompatActivity() {


    protected fun hideKeyboard() {

    }
    
    inline public fun <reified T : Activity> showActivity() {
        startActivity(Intent(this, T::class.java))
    }
}