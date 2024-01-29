package com.example.ventanasdearitzperez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Localizar los controles
        txtSaludo = findViewById<TextView>(R.id.txtSaludo)

        //Recuperamos la informacion pasada en el intent
        val bundle = intent.extras

        //Construimos el mensahje a mostrar
        txtSaludo.text = "Hola ${bundle?.getString("NOMBRE")}"
    }
}