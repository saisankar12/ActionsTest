package com.example.actionstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class InsertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
    }

    fun submit(view: View) {
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
    }
}