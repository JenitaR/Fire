package com.example.fire

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirefighterDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firefighter_dashboard)

        // Priority alerts list
        val alerts = listOf(
            Alert("#1 - 123 Oak Street, Downtown", "08:00 pm", "active"),
            Alert("#3 - 789 Commercial Blvd, Industrial", "07:15 pm", "on-scene")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerAlerts)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AlertAdapter(alerts)
    }
}

// Data model
data class Alert(val location: String, val time: String, val status: String)


