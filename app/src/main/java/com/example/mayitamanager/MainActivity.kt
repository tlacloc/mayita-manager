package com.example.mayitamanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    /** Called when the user taps the Customer button */
    fun goToCustomers(view: View){
        val intent = Intent(this, CustomerActivity::class.java)
        startActivity(intent)

    }

    /** Called when the user taps the Orders button */
    fun goToOrders(view: View){
        val intent = Intent(this, OrderActivity::class.java)
        startActivity(intent)
    }

    /** Called when the user taps the Stats button */
    fun goToStats(view: View){
        val intent = Intent(this, StatActivity::class.java)
        startActivity(intent)
    }


}