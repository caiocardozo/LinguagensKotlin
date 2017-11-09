package com.example.caiocardozo.linguagensprogramacaokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class ItalianoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italiano)

        var italianoArray = resources.getStringArray(R.array.ArrayItaliano) as Array

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, italianoArray) as ArrayAdapter<String>
        var listView: ListView = findViewById(R.id.rootItaliano)
        listView.adapter = adapter
    }
}
