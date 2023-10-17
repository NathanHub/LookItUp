package com.south95.looktopia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.south95.looktopia.databinding.ActivityMainBinding

class OptionsActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_options)
        //binding = ActivityMainBinding.inflate(layoutInflater)
       // setContentView(binding.root)

        //val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val btn = findViewById<Button>(R.id.find_your_business)
        btn.setOnClickListener {
            //Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()
            //val intent = Intent(this, LoginSignInActivity::class.java)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

       // binding.
    }
}