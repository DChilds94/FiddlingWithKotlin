package main

fun main() {
    val h1 = Header("h1")
    val h2 = Header("h2")
    val h3 = h1 plus h2

    println(h3)

    val h4 = h1 + h2
    println(h4)
}

class Header(var name: String)

infix operator fun Header.plus(other: Header) : String{
    var newHeader =  Header(this.name + other.name)
    return newHeader.name
}