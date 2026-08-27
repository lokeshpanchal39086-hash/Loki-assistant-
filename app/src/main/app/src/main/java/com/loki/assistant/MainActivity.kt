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

        textView.text = "LOKI\n\nYour personal AI assistant"
        textView.textSize = 24f
        textView.setTextColor(Color.WHITE)
        textView.setBackgroundColor(Color.BLACK)
        textView.gravity = Gravity.CENTER

        setContentView(textView)
    }
}
