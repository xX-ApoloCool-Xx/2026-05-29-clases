package org.example

import org.example.app.App
import org.example.app.Fecha
import org.example.app.Polinomio
import org.example.app.Cuadratica
import org.example.app.CuadraticaMejor

fun main() {
    println(App(26, 11, 2009).greeting)
    val date = App(26, 11, 2009)
    println(date.date32)
    val laFecha = Fecha(14, 5, 1989)
    println(laFecha.formatF)

    val polinomio: Polinomio = Polinomio()
    println(polinomio)
    val cuadratica: Cuadratica = Cuadratica()
    println(cuadratica)
    val cuadraticaM: CuadraticaMejor = CuadraticaMejor()
    println(cuadraticaM)
    var objeto: Polinomio
    objeto = Cuadratica()
    println(objeto)
    objeto = CuadraticaMejor()
    println(objeto)
    var lista = ArrayList <Polinomio>()

    lista.add(Cuadratica())
    lista.add(Polinomio())
    for(var polinomio32: lista){
        println(polinomio32)
    }
}