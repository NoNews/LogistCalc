package com.example.reg.androidKotlinTemplate.mvp.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

/**
 * Date: 22.04.2017
 * Time: 11:59
 * Project: LogistCalc2
 *
 * @author Alex Bykov
 * You can contact me at me@alexbykov.ru
 */


@StateStrategyType(SkipStrategy::class)
interface BaseView : MvpView {

}