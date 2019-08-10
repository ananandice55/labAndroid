package buu.informatics.s59160143.dicroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { setReset() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6 + 1)
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
         Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
    private fun setReset() {
        val setInt = 0
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = setInt.toString()
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}
