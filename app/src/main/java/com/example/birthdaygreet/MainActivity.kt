package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click.setOnClickListener {
            setSupportActionBar(toolbar)
            val name = write.editableText.toString()
//            Toast.makeText(this,"Welcome here : -{$name} ",Toast.LENGTH_LONG).show();

            val intent = Intent(this,BirthdayWish::class.java)
            intent.putExtra(BirthdayWish.New_name,name)
            startActivity(intent)
        }
    }
}