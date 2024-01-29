package com.example.ventanasdearitzperez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //Esto es necesario si luego lo hacemos con el findViewById
    private lateinit var txtNombre: EditText
    private  lateinit var btnAceptar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)

//        val txtNombre = findViewById<EditText>(R.id.txtNombre) Alternativa
//        val btnAceptar = findViewById<Button>(R.id.btnAceptar)

        // Implementamos el evento click del botón
        btnAceptar.setOnClickListener {
            // Creamos el Intent
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)

            // Creamos la información a pasar entre actividades
            val b = Bundle()
            b.putString("NOMBRE", txtNombre.text.toString())

            // Añadimos la información al intent
            intent.putExtras(b)

            // Iniciamos la nueva actividad
            startActivity(intent)
        }


    }
}