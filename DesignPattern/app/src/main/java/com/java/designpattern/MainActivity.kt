package com.java.designpattern

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun skipToDispatch(view: View) {
//        startActivity(Intent(this, DispatchActivity::class.java))
    }

    fun skipToText(view: View) {
//        startActivity(Intent(this, TextActivity::class.java))
    }

    fun skipToViewPager(view: View) {
//        startActivity(Intent(this, ViewpagerActivity2::class.java))
    }

    fun skipToCalculator(view: View) {
//        startActivity(Intent(this, CalculatorActivity::class.java))
    }
}
