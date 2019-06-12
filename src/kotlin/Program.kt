@file:JvmName("DisplayFunctions")
fun main(){
    display("Hello World, from Kotlin")
}

fun display(message: String) : Boolean {
    println(message)
    return true
}