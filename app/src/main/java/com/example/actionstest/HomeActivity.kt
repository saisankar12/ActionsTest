package com.example.actionstest

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class HomeActivity : AppCompatActivity() {
    var rv: RecyclerView? = null
    var fabButton: FloatingActionButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rv = findViewById(R.id.recycler)
        fabButton = findViewById(R.id.fab)

        this.fabButton?.setOnClickListener {
            startActivity(
                Intent(
                    this@HomeActivity,
                    InsertActivity::class.java
                )
            )
        }

    }
}