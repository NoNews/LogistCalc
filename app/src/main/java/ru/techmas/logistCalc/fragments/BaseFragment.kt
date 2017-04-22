package ru.techmas.logistCalc.fragments

import android.app.Activity
import android.content.Intent
import android.view.View
import com.arellomobile.mvp.MvpAppCompatFragment
import ru.techmas.logistCalc.R

open class BaseFragment : MvpAppCompatFragment() {

    var rootView: View? = null


    fun hideKeyboard() {

    }

    inline public fun <reified T : Activity> showActivity() {
        startActivity(Intent(context, T::class.java))
        activity.overridePendingTransition(R.anim.no_animation, R.anim.no_animation)
    }

}