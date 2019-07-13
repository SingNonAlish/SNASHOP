package com.example.snashop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
            R.id.home -> {
                CreateTabPage()
            }
            R.id.product-> CreateFragmentProduct()
            R.id.info-> CreateFragmentInfo()
            R.id.action_settings -> CreateFragmentSettings()
            R.id.user -> CreateFragmentUser()
        }
            true
        }
    }

    fun CreateTabPage(){
        toolBar.setTitle("xxx")
        setSupportActionBar(toolBar)

        val fragmentAdapter = MyPageAdapter(supportFragmentManager)
        viewPager.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(viewPager)
    }

    fun CreateFragmentHome(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = HomeFragment()
        transaction.replace(R.id.layoutFragment,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun CreateFragmentProduct(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = ProductFragment()
        transaction.replace(R.id.layoutFragment,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun CreateFragmentInfo(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = InfoFragment()
        transaction.replace(R.id.layoutFragment,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun CreateFragmentSettings(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = SettingsFragment()
        transaction.replace(R.id.layoutFragment,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    fun CreateFragmentUser(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = UserFragment()
        transaction.replace(R.id.layoutFragment,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
