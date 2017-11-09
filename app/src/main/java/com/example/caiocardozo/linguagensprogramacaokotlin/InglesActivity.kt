package com.example.caiocardozo.linguagensprogramacaokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class InglesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingles)

        var inglesArray = resources.getStringArray(R.array.ArrayIngles) as Array

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, inglesArray) as ArrayAdapter<String>
        var listView: ListView = findViewById(R.id.rootIngles)
        listView.adapter = adapter

    }
}
