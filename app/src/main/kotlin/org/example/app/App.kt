package org.example.app

class App (private val day: Int, val mon: Int, val year: Int) {
    val greeting: String
        get() {
            return "Hello World!"
        }
    val date32: String
        get() = "$day/$mon/$year"
}