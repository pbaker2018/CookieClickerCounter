package com.baker.cookieclickercounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cookieCount(view: View) {
        val num = counterTxt.text.toString().toInt()
        val newNum = num + 1
        counterTxt.text = newNum.toString()
    }

    fun startFromZero(view: View) {
        counterTxt.text = "0"
    }
}
