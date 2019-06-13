package main

fun main() {
    val text = "With    multiple \t whitespace"
    println(text)
    println(replaceWhiteSpace(text))
    println(text.replaceWhiteSpaceExtension())
}

fun replaceWhiteSpace(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

fun String.replaceWhiteSpaceExtension() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}