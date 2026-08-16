package com.loki.assistant

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(40, 40, 40, 40)
        layout.setBackgroundColor(Color.BLACK)

        val title = TextView(this)
        title.text = "LOKI"
        title.textSize = 36f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val message = TextView(this)
        message.text = "Your personal AI assistant"
        message.textSize = 18f
        message.setTextColor(Color.LTGRAY)
        message.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(message)

        setContentView(layout)
    }
}
