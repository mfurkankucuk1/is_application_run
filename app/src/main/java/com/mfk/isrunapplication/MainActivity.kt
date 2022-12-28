package com.mfk.isrunapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Checking if the application is open
        if (IsRunApplicationHelper.isRunForegroundThisApplication(this)){
            // What to do if the app is open
            Log.e(this@MainActivity.javaClass.name, "Application is open" )
        }else{
            // What to do if the app is close
            Log.e(this@MainActivity.javaClass.name, "Application is not open" )
        }
    }
}