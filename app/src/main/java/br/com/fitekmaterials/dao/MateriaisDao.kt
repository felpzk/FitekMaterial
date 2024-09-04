package br.com.fitekmaterials.dao

import br.com.fitekmaterials.models.Produto

class MateriaisDao {

    fun adiciona(produto: Produto) {
        materiais.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return materiais.toList()
    }

    companion object {
        private val materiais = mutableListOf<Produto>()
    }
}