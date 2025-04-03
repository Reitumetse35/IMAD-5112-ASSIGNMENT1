package com.example.foodtoeat








import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //get the button and edit text using the id we set on the user interface
    val SubmitButton = findViewById<Button>(R.id.button5)
    val Inputtime = findViewById<EditText>(R.id.Inputtime)
    val ResetButton = findViewById<Button>(R.id.button6)
    val textView = findViewById<TextView>(R.id.textView)
    val textView2 = findViewById<TextView>(R.id.textView2)

    // set a click listener for SubmitButton
val button5=
   SubmitButton.setOnClickListener {
        SubmitButton.setOnClickListener {
            val InputText: String = Inputtime.text.toString().lowercase()
            // type of meal suggestions based on time of the day
            when (InputText) {
                "breakfast" -> {
                    textView2.text = "Oats,Banana with berries & strawberries"
                }

                "early snack" -> {
                    textView2.text = "chicken mayo"
                }

                "lunch" -> {
                    textView2.text = "pap & wors,Kota or rice & mince"
                }

                "afternoon snack" -> {
                    textView2.text = "oreo"
                }


            }
            // set a click listener for Reset Button
            ResetButton.setOnClickListener {
 Inputtime.text.clear()
                textView2.text=""
            }


        }
    }
}

