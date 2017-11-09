package com.example.caiocardozo.linguagensprogramacaokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*

class ItalianoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italiano)

        var italianoArray = resources.getStringArray(R.array.ArrayItaliano) as Array
        var italianoList = Arrays.asList(*italianoArray) as List<String>

        var root: LinearLayout = findViewById(R.id.rootItaliano)
        for (txt in italianoList){
            var txtObtido = TextView(this)
            txtObtido.text = txt
            root.addView(txtObtido)
        }
    }
}
