package com.example.caiocardozo.linguagensprogramacaokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class EspanholActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espanhol)

        var espanholArray = resources.getStringArray(R.array.ArrayEspanhol)

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, espanholArray) as ArrayAdapter<String>
        var listView: ListView = findViewById(R.id.rootEspanhol)
        listView.adapter = adapter


    }
}
