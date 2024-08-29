package br.com.fitekmaterials.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.fitekmaterials.R
import br.com.fitekmaterials.ui.recyclerview.adapter.ListaProdutosAdapter


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.textView)
//        nome.text = "LISTA DE MATERIAIS"
//        val descricao = findViewById<TextView>(R.id.nome)
//        descricao.text = "CABO LOW FRICTION"
//        val descricaoTwo = findViewById<TextView>(R.id.serial)
//        descricaoTwo.text = "CABO HARD FRICTION"
//        val descricaoThree = findViewById<TextView>(R.id.quant)
//        descricaoThree.text = "CABO MEDIUM FRICTION"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()
    }

}