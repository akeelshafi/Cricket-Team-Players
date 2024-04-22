package com.twoplus.secondbasictestapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NewActivity : AppCompatActivity(){

    private lateinit var editMobileNumber:EditText
    private lateinit var editPassword:EditText
    private lateinit var editLoginBtn:Button
    private lateinit var editForgot:TextView
    private val validMobileNumber ="6005027963"
    private val validPassword ="akeel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        editMobileNumber = findViewById(R.id.phoneNumber)
        editPassword = findViewById(R.id.password)
        editLoginBtn = findViewById(R.id.LoginBtn)
        editForgot = findViewById(R.id.forgotPassword)
        editLoginBtn.setOnClickListener {

            val mobileNumber = editMobileNumber.text.toString()
            val password = editPassword.text.toString()

            if (mobileNumber==validMobileNumber && password==validPassword){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Incorrect Number or Password",Toast.LENGTH_LONG).show()
            }

            Toast.makeText(this,"Welcome to pakistan cricket team",Toast.LENGTH_LONG).show()
        }

    }
}