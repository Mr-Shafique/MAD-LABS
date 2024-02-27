package com.example.activity02

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var ears: ImageView
    private lateinit var shoes: ImageView
    private lateinit var hat: ImageView
    private lateinit var arms: ImageView
    private lateinit var eyes: ImageView
    private lateinit var eyebrows: ImageView
    private lateinit var glasses: ImageView
    private lateinit var mouth: ImageView
    private lateinit var mustache: ImageView
    private lateinit var nose: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
    }

    private fun initializeViews() {
        ears = findViewById(R.id.Ears)
        shoes = findViewById(R.id.Shoes)
        hat = findViewById(R.id.Hat)
        arms = findViewById(R.id.Arms)
        eyes = findViewById(R.id.Eyes)
        eyebrows = findViewById(R.id.Eyebrows)
        glasses = findViewById(R.id.Glasses)
        mouth = findViewById(R.id.Mouth)
        mustache = findViewById(R.id.Mustache)
        nose = findViewById(R.id.Nose)
    }

    fun checkAll(view: View) {
        when (view.id) {
            R.id.checkboxEars -> ears.visibility = if (ears.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxArms -> arms.visibility = if (arms.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxShoes -> shoes.visibility = if (shoes.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxEyebrows -> eyebrows.visibility = if (eyebrows.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxEyes -> eyes.visibility = if (eyes.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxGlasses -> glasses.visibility = if (glasses.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxMouth -> mouth.visibility = if (mouth.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxNose -> nose.visibility = if (nose.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxMustache -> mustache.visibility = if (mustache.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            R.id.checkboxHat -> hat.visibility = if (hat.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
        }
    }
}