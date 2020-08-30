package com.example.swipeapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

@Suppress("DEPRECATION")
class PagerAdapter (fm: FragmentManager) : FragmentStatePagerAdapter(fm){

    private val tabName : Array<String> = arrayOf("Home", "Status", "Profile")

    override fun getItem(position: Int): Fragment {
        when (position) {

            0 -> return Fragment1()
            1-> return Fragment2()
            else -> return Fragment3()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? = tabName.get(position)


}