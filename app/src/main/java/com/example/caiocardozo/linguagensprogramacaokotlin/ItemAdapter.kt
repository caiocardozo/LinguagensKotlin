package com.example.caiocardozo.linguagensprogramacaokotlin

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

/**
 * Created by caiocardozo on 10/11/17.
 */
class ItemAdapter : ArrayAdapter<Item>{

    private var backgroundColor: Int = 0

    //inicializa o adapter
    constructor(context: Context, list: ArrayList<Item>, backgroundColor: Int) : super(context, 0,list) {
        this.backgroundColor = backgroundColor
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var itemView = convertView
            if (itemView == null){//infla o layout
                itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        }


        //retorna o item que foi pego em cima
        var item = getItem(position) as Item

        //recuperar as view do layout para setar
        // o !! verifica se a variavel é nula
        var titulo: TextView = itemView!!.findViewById(R.id.item_titulo)
        titulo.text = item.titulo

        var descricao: TextView = itemView.findViewById(R.id.item_desc)
        descricao.text = item.descricao

        var imagem: ImageView = itemView.findViewById(R.id.item_icone)
        imagem.setImageResource(item.imagem)

        var layoutTextos: LinearLayout = itemView.findViewById(R.id.layout_textos)

        //atribui a minha cor ao layout
        var cor = ContextCompat.getColor(context, backgroundColor)
        layoutTextos.setBackgroundColor(cor)

        return itemView
    }
}