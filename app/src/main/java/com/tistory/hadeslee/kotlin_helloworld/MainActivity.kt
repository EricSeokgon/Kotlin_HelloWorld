package com.tistory.hadeslee.kotlin_helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("abcb", "on create")
    }

    override fun onStart() {
        super.onStart()

        Log.d("abcb", "on Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("abcb", "on Resume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("abcb", "on Restart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("abcb", "on Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("abcb", "on Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
