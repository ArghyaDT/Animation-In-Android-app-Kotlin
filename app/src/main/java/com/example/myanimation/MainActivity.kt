package com.example.myanimation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.MainActivity3
import com.example.myapplication.MainActivity4
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)


        val animText= findViewById<TextView>(R.id.anmText)

        val fadeIn= findViewById<Button>(R.id.fadeIn)
        val fadeOut= findViewById<Button>(R.id.fadeOut)
        val zoomIn= findViewById<Button>(R.id.zoomIn)
        val zoomOut= findViewById<Button>(R.id.zoomOut)
        val bounce= findViewById<Button>(R.id.bounce)
        val rotate= findViewById<Button>(R.id.rotate)
        val slidUp= findViewById<Button>(R.id.slidUp)
        val slidDown= findViewById<Button>(R.id.sliddown)

        fadeIn.setOnClickListener{
            val ani=AnimationUtils.loadAnimation(this, R.anim.fade_in)
            animText.startAnimation(ani)
        }

        fadeOut.setOnClickListener{
            val ani=AnimationUtils.loadAnimation(this, R.anim.fede_out)
            animText.startAnimation(ani)
        }

        zoomIn.setOnClickListener{
            val ani=AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            animText.startAnimation(ani)
        }

        zoomOut.setOnClickListener{
            val ani =AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            animText.startAnimation(ani)
        }

        bounce.setOnClickListener{
            val ani= AnimationUtils.loadAnimation(this, R.anim.bounce)
            animText.startAnimation(ani)
        }

        rotate.setOnClickListener{
            val ani = AnimationUtils.loadAnimation(this, R.anim.rotate)
            animText.startAnimation(ani)
        }

        slidUp.setOnClickListener{
            val ani = AnimationUtils.loadAnimation(this, R.anim.slid_up)
            animText.startAnimation(ani)
        }

        slidDown.setOnClickListener{
            val ani = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            animText.startAnimation(ani)
        }

        val next= findViewById<Button>(R.id.click_next)

        next.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }

        val next1= findViewById<Button>(R.id.next1)

        next.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}