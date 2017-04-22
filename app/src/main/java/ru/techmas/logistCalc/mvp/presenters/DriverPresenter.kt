package ru.techmas.logistCalc.mvp.presenters

import com.arellomobile.mvp.InjectViewState
import ru.techmas.logistCalc.mvp.views.DriverView

/**
 * Date: 22.04.2017
 * Time: 18:12
 * Project: LogistCalc
 *
 * @author Alex Bykov
 * You can contact me at me@alexbykov.ru
 */
@InjectViewState
class DriverPresenter : BasePresenter<DriverView>() {

    init {
        setupFields()
    }

    private fun setupFields() {
        viewState.setupFullName("Указать")
        viewState.setupPassport("Указать")
        viewState.setupDriveCard("Указать")
        viewState.setupPhone("+7 (999) 999-99-99")
    }


}