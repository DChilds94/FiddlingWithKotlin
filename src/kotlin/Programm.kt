
fun main() {
    var daniel = Human(1, "Daniel")
    var childs = Human(1, "Daniel")

    println(daniel) // as this is a data class kotlin calls a .toString method

    if (daniel == childs) { // a data class compares all of the values in the comparison
        println("Equal $daniel $childs")
    } else {
        println("Not Equal $daniel $childs")
    }

    var newDaniel = daniel.copy(name = "Dan")

    println(newDaniel)
}

data class Human(val id: Int, val name: String)
//useful if you need to store a class in a collection.
