package com.example.proby2

import androidx.core.content.ContextCompat


import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import android.Manifest

class MainActivity : AppCompatActivity() {

    private val launcher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { it: Boolean ->
            println("aaaaa = $it")
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launcher.launch(Manifest.permission.CAMERA)
//        println(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA))


    }
}