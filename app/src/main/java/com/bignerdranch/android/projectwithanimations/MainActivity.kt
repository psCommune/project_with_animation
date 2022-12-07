package com.bignerdranch.android.projectwithanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.view.isVisible

private lateinit var snowman: ImageButton
private lateinit var anim: Animation
private lateinit var obed: ImageView
private lateinit var yutnenko: ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        snowman = findViewById(R.id.button_snowman)
        obed = findViewById(R.id.obed_view)
        yutnenko = findViewById(R.id.yutnenko_view)

        snowman.isVisible = false
        obed.isVisible = false
        yutnenko.isVisible = false
        val handler = android.os.Handler()
        android.os.Handler().postDelayed({
            snowman.isVisible = true
            anim = AnimationUtils.loadAnimation(this, R.anim.snowman_rotation)
            snowman.startAnimation(anim) }, 2000)

        snowman.setOnClickListener(){
            obed.isVisible = true
            yutnenko.isVisible = true
            anim = AnimationUtils.loadAnimation(this, R.anim.obed_yutnenko_animation)
            obed.startAnimation((anim))
            yutnenko.startAnimation((anim))

        }
    }
}
