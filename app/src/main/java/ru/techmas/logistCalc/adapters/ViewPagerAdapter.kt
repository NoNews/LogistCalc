package ru.techmas.logistCalc.adapters

import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import ru.techmas.logistCalc.fragments.BaseTabFragment

/**
 * Date: 22.04.2017
 * Time: 14:10
 * Project: LogistCalc
 *
 * @author Alex Bykov
 * You can contact me at me@alexbykov.ru
 */
class ViewPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {


    var fragments: HashMap<Int, BaseTabFragment>? = null
    var context: Context? = null


    constructor(context: Context, fm: FragmentManager, fragments: HashMap<Int, BaseTabFragment>) : this(fm) {
        this.context = context
        this.fragments = fragments
    }


    override fun getItem(position: Int): BaseTabFragment? = fragments!![position]
    override fun getCount(): Int = fragments!!.size
    override fun getPageTitle(position: Int): String? = fragments!![position]?.title
}