package com.example.snashop

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class CustomPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    var mFm = fm
    var mFragmentItems : ArrayList<Fragment> = ArrayList()
    var mFragmentTitles : ArrayList<String> = ArrayList()

    fun addFragments(fragmentItem:Fragment,fragmentTitle:String){
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitle)
    }

    override fun getItem(p0: Int): Fragment {
        return  mFragmentItems[p0]
    }

    override fun getCount(): Int {
        return  mFragmentItems.size
    }
}