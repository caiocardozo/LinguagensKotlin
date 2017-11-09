package com.example.caiocardozo.linguagensprogramacaokotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //atribuindo  valor do textVoew a variavel strJava
        val textJava: TextView = findViewById(R.id.textAlemao)
        //insere o clique listener no textView
        textJava.setOnClickListener { user ->
            //cria a intent para a tela Java passando
            val intent = Intent(this, AlemaoActivity::class.java)
            startActivity(intent)
        }

        val textDotNet: TextView = findViewById(R.id.textIngles)
        textDotNet.setOnClickListener{
            val intent = Intent(this, InglesActivity:: class.java)
            startActivity(intent)
        }

        val textBrasileiro: TextView = findViewById(R.id.textBrasileiro)
        textBrasileiro.setOnClickListener {
            val intent = Intent(this, BrasileiroActivity::class.java)
            startActivity(intent)
        }

        val textReact: TextView = findViewById(R.id.textEspanhol)
        textReact.setOnClickListener {
            val intent = Intent(this, EspanholActivity::class.java)
            startActivity(intent)
        }

        val textPython: TextView = findViewById(R.id.textItaliano)
        textPython.setOnClickListener{
            val intent = Intent(this, ItalianoActivity::class.java)
            startActivity(intent)
        }

    }
}
