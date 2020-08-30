package com.example.swipeapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

@Suppress("DEPRECATION")
class PagerAdapter (fm: FragmentManager) : FragmentStatePagerAdapter(fm){

    private val tabName : Array<String> = arrayOf("Home", "Status", "Profile")

    override fun getItem(position: Int): Fragment {
        return when (position) {

            0 -> Fragment1()
            1-> Fragment2()
            else -> Fragment3()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? = tabName[position]


}