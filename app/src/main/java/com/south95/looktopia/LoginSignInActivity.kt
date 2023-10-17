package com.south95.looktopia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class LoginSignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_in)

        val btn = findViewById<ImageButton>(R.id.find_your_business)
        btn.setOnClickListener {
            //Toast.makeText(this@MainActivity, "Hello", Toast.LENGTH_SHORT).show()
            //val intent = Intent(this, LoginSignInActivity::class.java)
            //startActivity(intent)
        }
    }
}