package br.com.fitekmaterials.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fitekmaterials.R
import br.com.fitekmaterials.models.Produto
import br.com.fitekmaterials.ui.recyclerview.adapter.ListaProdutosAdapter


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto("Teste", "test desc", "test desc3"),
            Produto("Teste2", "Test2 desc2", "test2 desc3")
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}