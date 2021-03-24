package com.cxy.lifecyclehandlerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log
import com.cxy.lifecyclehandler.LifecycleHandler

class LifecycleHandlerActivity : AppCompatActivity() {
    private val tag = LifecycleHandlerActivity::class.java.name
    private val handler = LifecycleHandler(Looper.getMainLooper(),this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life)
        handler.postDelayed({
            Log.v(tag, "handler run")
        }, 5000)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(tag, "onDestroy")
    }
}