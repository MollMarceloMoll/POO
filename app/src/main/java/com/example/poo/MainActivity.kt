package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun value_try (a: Int, b: Int): Any {
            var res =
                try {
                    println("Division $a / $b")
                    a / b
                } catch (e: Exception) {
                    println("Vamos a manejar este error")
                    "Division no permitida"
                }
            return  res
        }

        var persona: Persona = Persona("Marcelo",30)
        persona.propiedad = 99
        println(persona.propiedad)

        var res1 = value_try(10,2)
        println(res1)
        var res2 = value_try(10,0)
        println(res2)
    }
}