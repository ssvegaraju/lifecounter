package com.dichotomyllc.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var p1: Int = 20
    var p2: Int = 20
    var p3: Int = 20
    var p4: Int = 20

    // There was p̶r̶o̶b̶a̶b̶l̶y̶ definitely a better way of doing this but uh, it works.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1Health: TextView = findViewById<TextView>(R.id.textViewP1HP)
        val p2Health: TextView = findViewById<TextView>(R.id.textViewP2HP)
        val p3Health: TextView = findViewById<TextView>(R.id.textViewP3HP)
        val p4Health: TextView = findViewById<TextView>(R.id.textViewP4HP)

        findViewById<Button>(R.id.buttonMinus5).setOnClickListener {
            minus(5, p1Health)
        }
        findViewById<Button>(R.id.buttonMinus).setOnClickListener {
            minus(1, p1Health)
        }
        findViewById<Button>(R.id.buttonPlus).setOnClickListener {
            plus(1, p1Health)
        }
        findViewById<Button>(R.id.buttonPlus5).setOnClickListener {
            plus(5, p1Health)
        }

        findViewById<Button>(R.id.buttonP2Minus5).setOnClickListener {
            minus(5, p2Health)
        }
        findViewById<Button>(R.id.buttonP2Minus).setOnClickListener {
            minus(1, p2Health)
        }
        findViewById<Button>(R.id.buttonP2Plus).setOnClickListener {
            plus(1, p2Health)
        }
        findViewById<Button>(R.id.buttonP2Plus5).setOnClickListener {
            plus(5, p2Health)
        }

        findViewById<Button>(R.id.buttonP3Minus5).setOnClickListener {
            minus(5, p3Health)
        }
        findViewById<Button>(R.id.buttonP3Minus).setOnClickListener {
            minus(1, p3Health)
        }
        findViewById<Button>(R.id.buttonP3Plus).setOnClickListener {
            plus(1, p3Health)
        }
        findViewById<Button>(R.id.buttonP3Plus5).setOnClickListener {
            plus(5, p3Health)
        }

        findViewById<Button>(R.id.buttonP4Minus5).setOnClickListener {
            minus(5, p4Health)
        }
        findViewById<Button>(R.id.buttonP4Minus).setOnClickListener {
            minus(1, p4Health)
        }
        findViewById<Button>(R.id.buttonP4Plus).setOnClickListener {
            plus(1, p4Health)
        }
        findViewById<Button>(R.id.buttonP4Plus5).setOnClickListener {
            plus(5, p4Health)
        }


    }

    fun minus(amount: Int, txt: TextView) {
        var updateText = ""
        var newHealth = 0;
        val deathText: TextView = findViewById<TextView>(R.id.textViewDeath)
        when (txt.id) {
            R.id.textViewP1HP -> {
                p1 -= amount
                newHealth = p1
                updateText = "1"
            }
            R.id.textViewP2HP -> {
                p2 -= amount
                newHealth = p2
                updateText = "2"
            }
            R.id.textViewP3HP -> {
                p3 -= amount
                newHealth = p3
                updateText = "3"
            }
            R.id.textViewP4HP -> {
                p4 -= amount
                newHealth = p4
                updateText = "4"
            }
        }
        txt.setText("Player $updateText HP: $newHealth")
        if (newHealth <= 0) {
            deathText.setText("Player $updateText LOSES!")
        }
    }

    fun plus(amount: Int, txt: TextView) {
        var updateText = ""
        var newHealth = 0;
        when (txt.id) {
            R.id.textViewP1HP -> {
                p1 += amount
                newHealth = p1
                updateText = "1"
            }
            R.id.textViewP2HP -> {
                p2 += amount
                newHealth = p2
                updateText = "2"
            }
            R.id.textViewP3HP -> {
                p3 += amount
                newHealth = p3
                updateText = "3"
            }
            R.id.textViewP4HP -> {
                p4 += amount
                newHealth = p4
                updateText = "4"
            }
        }
        txt.setText("Player $updateText HP: $newHealth")
    }
}
