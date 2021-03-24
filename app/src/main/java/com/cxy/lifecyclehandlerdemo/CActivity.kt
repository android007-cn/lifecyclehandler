package com.cxy.lifecyclehandlerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

class CActivity : AppCompatActivity() {
    private val tag = CActivity::class.java.name
    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        handler.postDelayed({
            Log.v(tag, "handler run")
        }, 5000)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(tag,"onDestroy")
        handler.removeCallbacksAndMessages(null)
    }
}