package za.ac.iie.icetask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get the switch that turns on guessing game
        val switch1 = findViewById<switch>(R.id.switch1)

        // add code for the button that happens when it is clicked
        Button1.setOnClickListener{
            var button: String
            if (switch1.isChecked)
                Button = "guessing game, ${nameEditText.text}!"
        } else{
            Button = "guessing game, ${nameEditText.text}!"
        }
        welcomeTextView.text = guessing game
    }
}