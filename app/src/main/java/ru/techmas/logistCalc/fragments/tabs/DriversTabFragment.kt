package ru.techmas.logistCalc.fragments.tabs


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_drivers_tab.*

import ru.techmas.logistCalc.R
import ru.techmas.logistCalc.activities.NewDriverActivity
import ru.techmas.logistCalc.mvp.presenters.DriverTabPresenter
import ru.techmas.logistCalc.mvp.views.DriverTabView


class DriversTabFragment : BaseTabFragment(), DriverTabView {

    val LAYOUT = R.layout.fragment_drivers_tab

    @InjectPresenter lateinit var driverTabPresenter: DriverTabPresenter

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

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        fabAdd.setOnClickListener { showActivity<NewDriverActivity>() }
    }


}
