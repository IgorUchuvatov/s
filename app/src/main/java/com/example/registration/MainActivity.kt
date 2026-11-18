package com.example.registration

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etLogin = findViewById<EditText>(R.id.etLogin)
        val etPassword = findViewById<EditText>(R.id.etPassword)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val login = etLogin.text.toString()
            val password = etPassword.text.toString()
            val msg = if (login.isBlank() || password.isBlank()) "Заполните все поля"
                      else "Привет, $login!"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnLoginWith).setOnClickListener {
            Toast.makeText(this, "Вход через Google", Toast.LENGTH_SHORT).show()
        }
    }
}
