@file:JvmName("DisplayFunctions")
fun main(){
    display("Hello World, from Kotlin")
    log("Hello World from log function")
}

fun display(message: String) : Boolean {
    println(message)
    return true
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}
