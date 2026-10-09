package com.example.logging

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 9. «Сажаем дерево» Timber
        Timber.plant(Timber.DebugTree())

        val editText = findViewById<EditText>(R.id.editText)
        val buttonLog = findViewById<Button>(R.id.button_log)
        val buttonTimber = findViewById<Button>(R.id.button_timber)

        // 6. Обработчик для button_log — Log.v с тегом "From EditText"
        buttonLog.setOnClickListener {
            Log.v("From EditText", editText.text.toString())
        }

        // 10. Обработчик для button_timber — Timber.v без тега
        buttonTimber.setOnClickListener {
            Timber.v(editText.text.toString())
        }
    }
}