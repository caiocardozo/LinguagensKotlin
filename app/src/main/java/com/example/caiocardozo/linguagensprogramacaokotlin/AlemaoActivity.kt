package com.example.caiocardozo.linguagensprogramacaokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*

class AlemaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alemao)

        var alemaoArray = resources.getStringArray(R.array.ArrayAlemao) as Array
        var alemaoList = Arrays.asList(*alemaoArray) as List<String>

        var root: LinearLayout = findViewById(R.id.rootAlemao)
        for (txt in alemaoList){
            var txtObtido = TextView(this)
            txtObtido.text = txt
            root.addView(txtObtido)

        }
    }
}
