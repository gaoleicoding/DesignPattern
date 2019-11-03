package com.java.designpattern.pattern1_singleton

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.java.designpattern.R
import kotlinx.android.synthetic.main.activity_singleton.*


class SingletonActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singleton)
        tv_singleton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                SingletonInnerClass.getInstance().toast(this@SingletonActivity);
            }

        })

    }

}

