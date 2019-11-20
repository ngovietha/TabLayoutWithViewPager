package com.example.tablayoutwithviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.title = "Tabs"


        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FirstFragment(), "1st")
        adapter.addFragment(SecondFragment(), "2nd")
        adapter.addFragment(ThirdFragment(), "3rd")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}
