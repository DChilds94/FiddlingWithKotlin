@file:JvmName("DisplayFunctions")

package main
fun main(){
    display("Daniel")
    println(log())

}

fun display(name: String) : String {
    return "Hello, $name"
}

@JvmOverloads
fun log(logLevel: Int = 1) : String {
    return "The current logging level is $logLevel"
}
