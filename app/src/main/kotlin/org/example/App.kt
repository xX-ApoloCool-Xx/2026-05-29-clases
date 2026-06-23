package org.example
import org.example.Polinomio
import org.example.Cuadratica
import org.example.CuadraticaMejor
import org.example.Cuatrinomio

fun main() {
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
    for (polinomio in lista){
        println(polinomio)
    }



}
