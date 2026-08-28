package com.loki.assistant

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "LOKI"
        textView.textSize = 30f
        textView.setTextColor(Color.BLACK)
        textView.gravity = Gravity.CENTER

        setContentView(textView)
    }
}
