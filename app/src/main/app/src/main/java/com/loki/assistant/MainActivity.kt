package com.loki.assistant

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tv = TextView(this)
        tv.text = "LOKI"
        tv.textSize = 30f
        tv.setTextColor(Color.BLACK)
        tv.gravity = Gravity.CENTER

        setContentView(tv)
    }
}
