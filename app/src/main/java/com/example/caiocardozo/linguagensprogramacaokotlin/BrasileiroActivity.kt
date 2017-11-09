package com.example.caiocardozo.linguagensprogramacaokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class BrasileiroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brasileiro)

        var brasileiroArray = resources.getStringArray(R.array.ArrayBrasileiro) as Array
        //cria o adapter passando como parametro a nossa activity e o nosso array de dados
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, brasileiroArray) as ArrayAdapter<String>
        //recuperar a listView
        var listView: ListView = findViewById(R.id.rootBrasileiro)
        listView.adapter = adapter
    }
}
