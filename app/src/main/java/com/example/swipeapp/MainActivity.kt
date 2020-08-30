package com.example.swipeapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*


@Suppress("PLUGIN_WARNING")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PagerAdapter(supportFragmentManager)
        val pager = findViewById<View>(R.id.pager) as ViewPager
        pager.adapter = adapter
        tabLayout.setupWithViewPager(pager)
        tabLayout.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#ffffff"))


    }

    fun onClick(v:View){
        pager.setCurrentItem(2,true)
    }
}
