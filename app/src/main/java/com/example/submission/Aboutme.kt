package com.example.submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Aboutme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "About Me"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    
}