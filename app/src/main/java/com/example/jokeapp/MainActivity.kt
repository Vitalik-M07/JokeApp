package com.example.jokeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.lifecycle.ViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = (application  as JokeApp).viewModel

        val button  = findViewById<Button>(R.id.actionButton)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val textView = findViewById<TextView>(R.id.textView)

        progressBar.visibility = View.INVISIBLE

        button.setOnClickListener(){
            button.isEnabled = false
            progressBar.visibility = View.VISIBLE
            viewModel.getJoke()
            
        }
    }
}