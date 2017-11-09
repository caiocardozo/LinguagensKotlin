package com.example.caiocardozo.linguagensprogramacaokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*

class BrasileiroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brasileiro)

        var brasileiroArray = resources.getStringArray(R.array.ArrayBrasileiro) as Array
        var brasileiroList = Arrays.asList(*brasileiroArray) as List<String>

        var root: LinearLayout = findViewById(R.id.rootBrasileiro)
        for (txt in brasileiroList){
            var txtObtido = TextView(this)
            txtObtido.text = txt
            root.addView(txtObtido)
        }
    }
}
