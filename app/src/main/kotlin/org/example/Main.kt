package org.example

import org.example.app.App
import org.example.app.Fecha

fun main() {
    println(App().greeting)
    val laFecha = Fecha(29, 5, 1996)
    println(laFecha.formatF)
}