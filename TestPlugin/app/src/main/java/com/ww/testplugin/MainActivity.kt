package com.ww.testplugin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_test.*
import zeus.plugin.ZeusBaseActivity

class MainActivity : ZeusBaseActivity() {
//zeusplugin_test zeusplugin_test_version2
    companion object {
        private const val TAG = "ZeusBaseActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        tv.text = "哈哈哈 更新为版本2"
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onStop: ")
    }
}