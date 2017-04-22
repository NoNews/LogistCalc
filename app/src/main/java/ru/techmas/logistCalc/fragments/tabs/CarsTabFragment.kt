package ru.techmas.logistCalc.fragments.tabs


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.presenter.InjectPresenter

import ru.techmas.logistCalc.R
import ru.techmas.logistCalc.mvp.presenters.CarsTabPresenter
import ru.techmas.logistCalc.mvp.views.CarsTabView


/**
 * A simple [Fragment] subclass.
 */
class CarsTabFragment : BaseTabFragment(), CarsTabView {

    val LAYOUT = R.layout.fragment_cars_tab


    @InjectPresenter lateinit var carsTabPresenter: CarsTabPresenter


    companion object {
        fun newInstance(context: Context): BaseTabFragment {
            val fragment: BaseTabFragment = CarsTabFragment()
            fragment.title = context.getString(R.string.tab_cars)
            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        rootView = inflater!!.inflate(LAYOUT, container, false)
        return rootView
    }

}
