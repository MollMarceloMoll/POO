package com.example.poo

open class Persona(var nombre: String, var edad: Int) {
    var propiedad: Int = 0
    set(value) {
        if (value > 10) field = value
        else field = 1
    }
}
class conductor (nombre: String, var auto: String): Persona(nombre){

}