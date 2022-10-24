package com.example.poo

open class Persona(var nombre: String, var edad: Int) {
    var propiedad: Int = 0
        get() = 777
    set(value) {
        if (value > 10) field = value
        else field = -1
    }
}
fun calculadora(a: Int) {
    var a = 10
}