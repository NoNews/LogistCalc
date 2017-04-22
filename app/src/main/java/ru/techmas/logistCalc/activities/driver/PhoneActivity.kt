package ru.techmas.logistCalc.activities.driver

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phone.*
import kotlinx.android.synthetic.main.toolbar.*
import ru.techmas.logistCalc.R
import ru.techmas.logistCalc.activities.BaseFieldActivity
import ru.tinkoff.decoro.MaskImpl
import ru.tinkoff.decoro.slots.PredefinedSlots
import ru.tinkoff.decoro.watchers.MaskFormatWatcher


class PhoneActivity : BaseFieldActivity() {

    val LAYOUT = R.layout.activity_phone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LAYOUT)
        setupToolbar()
        setupPhoneView()
        setupListeners()
    }

    private fun setupListeners() {
        btnOk.setOnClickListener { onBackPressed() }
    }

    private fun setupPhoneView() {
        val mask = MaskImpl(PredefinedSlots.RUS_PHONE_NUMBER, true)
        val watcher = MaskFormatWatcher(mask)
        watcher.installOn(etPhone)
        etPhone.requestFocus()
    }


    private fun setupToolbar() {
        toolbar.title = getString(R.string.activity_phone)
        setupBackButton(toolbar)
    }
}
