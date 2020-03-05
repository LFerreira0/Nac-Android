package com.example.androidprojectfinalactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import kotlinx.android.synthetic.main.activity_relatorio.*

class RelatorioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relatorio)

        var tabela = getSharedPreferences("click", Context.MODE_PRIVATE)
        mercadolivreclick.text = "Quantidade de cliques: " + tabela.getInt("qtdmercado", 0)
        buscapeclick.text = "Quantidade de cliques: " + tabela.getInt("qtdbuscape", 0)
        ebayclick.text = "Quantidade de cliques: " + tabela.getInt("qtdebay", 0)
        webclick.text = "Quantidade de cliques: " + tabela.getInt("qtdweb", 0)
        magaluclick.text = "Quantidade de cliques: " + tabela.getInt("qtdmagalu", 0)
        netclick.text = "Quantidade de cliques: " + tabela.getInt("qtdnet", 0)
        americanasclick.text = "Quantidade de cliques: " + tabela.getInt("qtdamericanas", 0)
        submarinoclick.text = "Quantidade de cliques: " + tabela.getInt("qtdsubmarino", 0)

    }
}
