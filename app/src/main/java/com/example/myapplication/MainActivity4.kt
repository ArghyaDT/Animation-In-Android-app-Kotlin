package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)

        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main4)

        val shimar = findViewById<ShimmerFrameLayout>(R.id.shimmer)
        shimar.startLayoutAnimation()
    }
}