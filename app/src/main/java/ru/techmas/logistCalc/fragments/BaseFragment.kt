package ru.techmas.logistCalc.fragments

import android.view.View
import com.arellomobile.mvp.MvpAppCompatFragment

open class BaseFragment : MvpAppCompatFragment() {

    var rootView: View? = null


    fun hideKeyboard() {

    }
}