package com.example.actionstest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 = findViewById<Button>(R.id.helloclick)
        b1.setOnClickListener(){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        AppCenter.start(
            application, "91eabdca-8174-4c95-b9a0-40d5ab281d4b",
            Analytics::class.java, Crashes::class.java
        )
    }
}