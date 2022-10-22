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

        fun suma(a: Int, b: Int, fa:(Int,Int)->Int): Int {
            return fa(a,b)
        }
        println(suma(100,100) { a: Int, b: Int -> a + b })

        fun ordenSuperior(n: Int, fn:(Int)-> Boolean): Boolean {
            return fn(n)
        }
        println("Comprobando si el número 10 es par  : "+ordenSuperior(10){x -> x % 2 == 0})
        println("Comprobando si el número 9 es primo  : "+ordenSuperior(9){
            x ->
            var primo = true
            for (i in 2..x / 2) {
                if (x % i == 0) {
                    primo = false
                    break
                }
            }
            primo
        })
        println("Comprobando si el número 15 es Guay : "+ordenSuperior(15){
            x ->
            var suma = 0
            var esGuay = false
            for (i in 1 .. x) {
                suma += i
                if (suma > x) break
                if (suma == x) {
                    esGuay = true
                    break
                }
            }
            esGuay
        })
    }
}
/*
Crear una funcion de Orden Superior que reciba un Int y una funcion que reciba un Int y devuelva un Boolean.

Llama a dicha funcion de Orden Superior con expreciones Lambads que hagan lo siguientes:

- Comprobar si el número es un número par
- Comprobar si el número es un numero primo
- Comprobar si el número es un número guay (un número es guay cuando es el resultado de la suma de números
consecutivos desde el 1. Por ejemplo el número 10 es guay porque 1+2+3+4 = 10. El 15 tambies es guay porque
1+2+3+4+5+ = 15. El número 8 no es guay porque no hay ninguna posible combinacion de sumas consecutivas desde el 1 que resulte 8)
 */