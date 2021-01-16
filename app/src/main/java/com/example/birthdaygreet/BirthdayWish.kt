package com.example.birthdaygreet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_wish.*

class BirthdayWish : AppCompatActivity() {

    companion object{
        const val New_name = "new_name"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wish)

        val name = intent.getStringExtra(New_name)
        greeting.text="Happy Birthday \n $name"
    }
}