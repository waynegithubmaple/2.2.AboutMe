package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone : Button = findViewById(R.id.done_button)

        btnDone.setOnClickListener(){
            val tvResult: TextView = findViewById(R.id.tv_Result)
            val tvName: TextView = findViewById((R.id.nickname_edit))

            tvResult.text = tvName.text.toString()

            tvResult.visibility = View.VISIBLE
            btnDone.visibility = View.GONE
            tvName.visibility = View.GONE
        }
    }
}