package com.example.caiocardozo.linguagensprogramacaokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class BrasileiroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brasileiro)

        var brasileiroArray = resources.getStringArray(R.array.ArrayBrasileiro) as Array
        //recupera o array de descrição dos times
        var brasileiroArrayDesc = resources.getStringArray(R.array.ArrayBrasileiroDesc) as Array

        //cria o array
        var list = ArrayList<Item>()
        for(i in 9 downTo 0){
            var titulo: String = brasileiroArray[i]
            var descricao: String = brasileiroArrayDesc[i]
            //cria o item e adiciona a imagem
            var item = Item(titulo, descricao, R.drawable.ic_launcher_background)
            list.add(item)
        }

        //cria o adapter passando como parametro a nossa activity e o nosso array de dados
        var adapter = ItemAdapter(this, list, R.color.colorBrasileiro)
        //recuperar a listView
        var listView: ListView = findViewById(R.id.rootBrasileiro)
        listView.adapter = adapter
    }
}
