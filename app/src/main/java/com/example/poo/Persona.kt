package com.example.poo

class Persona(var nombre: String, var edad: Int) {
    var propiedad: Int = 0
    set(value) {
        if (value > 10) field = value
        else field = 1
    }
}