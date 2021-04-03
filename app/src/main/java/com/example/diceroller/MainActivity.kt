package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btnRoll)
        val diceImage: ImageView = findViewById(R.id.imgResult)


        rollButton.setOnClickListener(){
            val result = (1..6).random()
            diceImage.setImageResource(when (result){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.dice_1
            })
            diceImage.contentDescription = result.toString()

            Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
        }
    }
}