package com.example.activity_01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private var numToGuess = (0..1000).random();

    fun validate(view: View){
        var inputField = findViewById<TextView>(R.id.inputtxt1);
        var label = findViewById<TextView>(R.id.txt2);
        var number = Integer.parseInt(inputField.text.toString());

        if(number > numToGuess){
            label.text = "Your guess is Too High"    }
       else if(number < numToGuess){
            label.text = "Your guess is Too Low"
      }
       else{
           label.text = "Hoorah!!... You are Correct"
       }

   }
}