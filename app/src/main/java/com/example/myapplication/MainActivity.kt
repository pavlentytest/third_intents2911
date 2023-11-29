package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn1: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when {
            v?.id == R.id.button -> {
                val str = "https://mirea.ru"
                // неявный Intent (намерение)
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse(str))
                startActivity(intent)
            }
            else -> {
                // явный Intent (намерение)
                val intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("key","Test message!")
              //  startActivity(intent)

            }


        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}