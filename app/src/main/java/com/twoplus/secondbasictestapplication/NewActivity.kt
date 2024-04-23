package com.twoplus.secondbasictestapplication

import android.content.Intent
import android.content.SharedPreferences
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
    private lateinit var sharedPreference : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        setContentView(R.layout.activity_new)

        sharedPreference = getSharedPreferences(getString(R.string.Preference_file_name),MODE_PRIVATE)
        val isLoggedIn = sharedPreference.getBoolean("isLoggedIn",false)
        if (isLoggedIn){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        editMobileNumber = findViewById(R.id.phoneNumber)
        editPassword = findViewById(R.id.password)
        editLoginBtn = findViewById(R.id.LoginBtn)
        editForgot = findViewById(R.id.forgotPassword)
        editLoginBtn.setOnClickListener {

            val mobileNumber = editMobileNumber.text.toString()
            val password = editPassword.text.toString()

            if (mobileNumber==validMobileNumber && password==validPassword){
                savedPreferences()
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Incorrect Number or Password",Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    private fun savedPreferences(){
        sharedPreference.edit().putBoolean("isLoggedIn",true).apply()
    }
}
