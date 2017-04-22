package ru.techmas.logistCalc.fragments

import android.app.Activity
import android.content.Intent
import android.view.View
import com.arellomobile.mvp.MvpAppCompatFragment

open class BaseFragment : MvpAppCompatFragment() {

    var rootView: View? = null


    fun hideKeyboard() {

    }

    inline public fun <reified T : Activity> showActivity() {
        startActivity(Intent(context, T::class.java))
    }
}