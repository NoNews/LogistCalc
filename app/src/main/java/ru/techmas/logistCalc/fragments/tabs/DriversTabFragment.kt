package ru.techmas.logistCalc.fragments.tabs


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.techmas.logistCalc.R
import ru.techmas.logistCalc.fragments.BaseTabFragment


class DriversTabFragment : BaseTabFragment() {

    val LAYOUT = R.layout.fragment_drivers_tab

    companion object {
        fun newInstance(context: Context): BaseTabFragment {
            val fragment: BaseTabFragment = DriversTabFragment()
            fragment.title = context.getString(R.string.tab_drivers)
            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        rootView = inflater!!.inflate(LAYOUT, container, false)
        return rootView
    }


}
