package com.example.androidprojectfinalactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabela = getSharedPreferences("click", Context.MODE_PRIVATE)

        mercado.setOnClickListener {

            var relatoriomercado = tabela.getInt("qtdmercado", 0)
            tabela.edit().putInt("qtdmercado", relatoriomercado +1)

            var intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)
        }

        buscape.setOnClickListener {

            var relatoriobuscape = tabela.getInt("qtdbuscape", 0)
            tabela.edit().putInt("qtdbuscape", relatoriobuscape +1)

            var intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra("url", "https://www.buscape.com.br/")
            startActivity(intent)
        }

        ebay.setOnClickListener {

            var relatorioebay = tabela.getInt("qtdebay", 0)
            tabela.edit().putInt("qtdebay", relatorioebay +1)

            var intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra("url", "https://www.ebay.com/")
            startActivity(intent)
        }

        web.setOnClickListener {

            var relatorioweb = tabela.getInt("qtdweb", 0)
            tabela.edit().putInt("qtdweb", relatorioweb +1)

            var intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra("url", "https://www.webmotors.com.br/")
            startActivity(intent)
        }

        magalu.setOnClickListener {

            var relatoriomagalu = tabela.getInt("qtdmagalu", 0)
            tabela.edit().putInt("qtdmagalu", relatoriomagalu +1)

            var intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra("url", "https://www.magazineluiza.com.br/")
            startActivity(intent)
        }

        net.setOnClickListener {

            var relatorionet = tabela.getInt("qtdnet", 0)
            tabela.edit().putInt("qtdnet", relatorionet +1)

            var intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra("url", "https://www.netshoes.com.br/")
            startActivity(intent)
        }

        americanas.setOnClickListener {

            var relatorioamericanas = tabela.getInt("qtdamericanas", 0)
            tabela.edit().putInt("qtdamericanas", relatorioamericanas +1)

            var intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra("url", "https://www.americanas.com.br/")
            startActivity(intent)
        }

        submarino.setOnClickListener {

            var relatoriosubmarino = tabela.getInt("qtdsubmarino", 0)
            tabela.edit().putInt("qtdsubmarino", relatoriosubmarino +1)

            var intent = Intent(this, WebviewActivity::class.java)
            intent.putExtra("url", "https://www.submarino.com.br/")
            startActivity(intent)
        }

    }
}
