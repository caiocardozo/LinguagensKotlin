package com.example.caiocardozo.linguagensprogramacaokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*

class EspanholActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espanhol)

        var espanholArray = resources.getStringArray(R.array.ArrayEspanhol)
        var espanholList = Arrays.asList(*espanholArray) as List<String>

       var root: LinearLayout = findViewById(R.id.rootEspanhol)
        for (txt in espanholList) {
            var txtObtido = TextView(this)
            txtObtido.text = txt
            root.addView(txtObtido)

        }

    }
}
