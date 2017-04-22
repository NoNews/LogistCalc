package ru.techmas.logistCalc.activities

import android.content.Intent
import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.activity_new_driver.*
import kotlinx.android.synthetic.main.activity_phone.*
import kotlinx.android.synthetic.main.toolbar.*
import ru.techmas.logistCalc.R
import ru.techmas.logistCalc.activities.driver.PhoneActivity
import ru.techmas.logistCalc.mvp.presenters.DriverPresenter
import ru.techmas.logistCalc.mvp.views.DriverView

class NewDriverActivity : BaseActivity(), DriverView {


    @InjectPresenter lateinit var driverPresenter: DriverPresenter

    val LAYOUT = R.layout.activity_new_driver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
        setupToolbar()
        setupListeners()
    }

    private fun setupListeners() {
        ltFullName.setOnClickListener { showActivity<SettingsActivity>() }
        ltPassport.setOnClickListener { showActivity<SettingsActivity>() }
        ltDriverCard.setOnClickListener { showActivity<SettingsActivity>() }
        ltPhone.setOnClickListener { showActivityWithTransition<PhoneActivity>() }
        btnSave.setOnClickListener { finish() }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    private fun setupToolbar() {
        toolbar.title = getString(R.string.activity_new_driver)
        setupBackButton(toolbar)
    }


    override fun setupFullName(fullname: String) {
        tvFullName.text = fullname
    }

    override fun setupPassport(passport: String) {
        tvPassport.text = passport
    }

    override fun setupDriveCard(driveCard: String) {
        tvDriverCard.text = driveCard
    }


    override fun setupPhone(phone: String) {
        tvPhone.text = phone

    }

}
