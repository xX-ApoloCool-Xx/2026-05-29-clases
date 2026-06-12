package org.example.app

class Fecha(private val dia: Int, val mes: Int, val ano: Int) {
    val formatF: String
        get() = "$dia/$mes/$ano"
}