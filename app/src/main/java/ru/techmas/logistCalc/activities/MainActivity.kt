package ru.techmas.logistCalc.activities

import android.os.Bundle
import android.view.Menu
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.reg.androidKotlinTemplate.mvp.views.MainActivityView
import kotlinx.android.synthetic.main.activity_main.*
import ru.techmas.logistCalc.R
import ru.techmas.logistCalc.adapters.ViewPagerAdapter
import ru.techmas.logistCalc.fragments.tabs.BaseTabFragment
import ru.techmas.logistCalc.fragments.tabs.CarsTabFragment
import ru.techmas.logistCalc.fragments.tabs.DriversTabFragment
import ru.techmas.logistCalc.mvp.presenters.MainActivityPresenter


class MainActivity : BaseActivity(), MainActivityView {


    val LAYOUT = R.layout.activity_main

    @InjectPresenter lateinit var mainActivityPresenter: MainActivityPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
        setSupportActionBar(toolbar)
        setupUI()
    }

    private fun setupUI() {
        toolbar.title = getString(R.string.app_name)
        setupTabs()
    }

    private fun setupTabs() {
        viewPager.adapter = ViewPagerAdapter(this, supportFragmentManager, getFragments())
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun getFragments(): HashMap<Int, BaseTabFragment> {
        val fragments = HashMap<Int, BaseTabFragment>()
        fragments.put(0, DriversTabFragment.newInstance(this))
        fragments.put(1, CarsTabFragment.newInstance(this))
        fragments.put(2, DriversTabFragment.newInstance(this))
        fragments.put(3, DriversTabFragment.newInstance(this))
        fragments.put(4, DriversTabFragment.newInstance(this))
        fragments.put(5, DriversTabFragment.newInstance(this))
        return fragments
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
