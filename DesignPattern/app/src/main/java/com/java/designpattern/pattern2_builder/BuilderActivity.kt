package com.java.designpattern.pattern2_builder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BuilderActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.java.designpattern.R.layout.activity_singleton)
        val computer = Computer.Builder()
            .setCpu("Intel Core i7")
            .setMotherboard("GIGABYTE Z97")
            .setDisplayCard("GTX Titan")
            .setRam("32G")
            .setDisk("2TB")
            .setPower("1000W")
            .create()

    }

}

