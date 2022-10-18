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

        fun calculadora (n1: Int, n2: Int, fn: (Int, Int)-> Int): Int {
            return fn (n1, n2)
        }

        fun suma (x: Int, y: Int): Int {return x + y}
        fun resta (x: Int, y: Int): Int {return x - y}
        fun multiplica (x: Int, y: Int) = x * y
        fun divide (x: Int, y: Int) = x / y


        var persona: Persona = Persona("Marcelo",30)
        persona.propiedad = 99
        println(persona.propiedad)

        var res1 = value_try(10,2)
        println(res1)
        var res2 = value_try(10,0)
        println(res2)

        println("La suma de 80 + 20 = ${calculadora(80,20, :: suma)}")
        println("La resta de 80 - 20 = ${calculadora(80,20, :: resta)}")
        println("La multiplicacion de 80 * 20 = ${calculadora(80,20, :: multiplica)}")
        println("La division de 80 / 20 = ${calculadora(80,20, :: divide)}")
    }

}