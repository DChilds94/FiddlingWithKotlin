
fun main() {
    val daniel = Student("Daniel", "Childs",1, "any")
    println(daniel.id)
    print(daniel.tutor)
    print(daniel.firstName)
    print(daniel.lastName)

}

abstract class Person(var firstName : String,  var lastName: String ) {

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String
}


class Student(firstName: String, lastName: String,_id: Int)
    : Person(firstName, lastName) { // Person() is used to call the default constructor

    val id : Int
    var tutor : String

    init {
        id = _id
        tutor = ""
    }

    constructor(firstName: String, lastName: String,
                _id: Int, tutor: String) :
    this (firstName, lastName, _id) {
        this.tutor = tutor
    }

    override fun getName() : String{return ""}

    override fun getAddress(): String {
        return ""
    }

    fun enrole(courseName : String) {
        val course = Courses.allCourses
            .filter{ it.title == courseName }
            .firstOrNull()
    }
}


//open class Person { // open overrides the default final class behaviour and allows you to inherit from the class
//    var firstName : String = ""
//    var lastName : String = ""
//
//    open fun getName() : String = "$firstName $lastName" // same as above
//}


// TODO split Student and Person into separate files