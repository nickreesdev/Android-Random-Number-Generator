package com.nickreesdev.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.isDigitsOnly
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val random = Random()

    private fun randomNumber(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val low = findViewById<EditText>(R.id.lowNumberEdit)
        val high = findViewById<EditText>(R.id.highNumberEdit)

        val button = findViewById<Button>(R.id.generate_button)
        button.setOnClickListener {
            val textView = findViewById<TextView>(R.id.response_text)
            textView.text = randomNumber(Integer.parseInt(low.text.toString()), Integer.parseInt(high.text.toString())).toString()
        }

    }
}