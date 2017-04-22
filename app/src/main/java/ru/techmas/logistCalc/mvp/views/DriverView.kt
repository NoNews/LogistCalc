package ru.techmas.logistCalc.mvp.views

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.reg.androidKotlinTemplate.mvp.views.BaseView

/**
 * Date: 22.04.2017
 * Time: 18:12
 * Project: LogistCalc
 *
 * @author Alex Bykov
 * You can contact me at me@alexbykov.ru
 */
@StateStrategyType(OneExecutionStateStrategy::class)
interface DriverView : BaseView {

    fun setupFullName(fullname: String)
    fun setupPassport(passport: String)
    fun setupDriveCard(driveCard: String)
    fun setupPhone(phone:String)
}