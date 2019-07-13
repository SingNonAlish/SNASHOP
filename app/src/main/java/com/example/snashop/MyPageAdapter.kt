package com.example.snashop

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPageAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
       return when(position){
            0-> {
                HomeFragment()
            }
            1-> ProductFragment()
            else-> {
                return InfoFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0-> "Home"
            1-> "Product"
            else->{
                return "Info"
            }
        }
    }
}