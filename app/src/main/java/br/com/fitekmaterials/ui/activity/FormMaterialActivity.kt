package br.com.fitekmaterials.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.fitekmaterials.R
import br.com.fitekmaterials.dao.MateriaisDao
import br.com.fitekmaterials.models.Produto

class FormMaterialActivity : AppCompatActivity(R.layout.activity_form_material) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botaoSalvar = findViewById<Button>(R.id.botaosalvar)
        botaoSalvar.setOnClickListener {
            val campoMaterial = findViewById<EditText>(R.id.material)
            val material = campoMaterial.text.toString()
            val campoSerial = findViewById<EditText>(R.id.serial)
            val serial = campoSerial.text.toString()
            val campoQuant = findViewById<EditText>(R.id.quant)
            val quant = campoQuant.text.toString()

            val produtoNovo = Produto(
                material = "MATERIAL: " + material,
                serial = "SERIAL: " + serial,
                quantidade = "QUANTIDADE: " + quant
            )

            Log.i(" FormMaterialActivity", "onCreate: $produtoNovo")
            val dao = MateriaisDao()
            dao.adiciona(produtoNovo)
            Log.i(" FormMaterialActivity", "onCreate: ${dao.buscaTodos()}")
        }
    }

}