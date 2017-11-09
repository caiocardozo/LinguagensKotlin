package com.example.caiocardozo.linguagensprogramacaokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import java.util.*

class AlemaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alemao)

        var alemaoArray = resources.getStringArray(R.array.ArrayAlemao) as Array

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, alemaoArray) as ArrayAdapter<String>
        var listView: ListView = findViewById(R.id.rootAlemao)
        listView.adapter = adapter
    }
}
