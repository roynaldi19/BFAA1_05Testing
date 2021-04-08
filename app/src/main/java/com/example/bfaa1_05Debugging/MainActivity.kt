package com.example.bfaa1_05Debugging

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.bfaa1_05testing.R

class MainActivity : AppCompatActivity() {

    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView
    private lateinit var imgPreview: ImageView

    private var names = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tv_text)
        btnSetValue = findViewById(R.id.btn_set_value)
        btnSetValue.setOnClickListener {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
        }

        names.add("Roy")
        names.add("Rio")
        names.add("Riyo")

        imgPreview = findViewById(R.id.img_preview)
        Glide.with(this).load(R.drawable.fronalpstock_big).into((imgPreview))
    }


}