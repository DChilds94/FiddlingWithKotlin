package main

fun main() {
    print("in the person main.main fun")
    val daniel = Student("Daniel", "Childs", 1, "any")
    println(daniel.id)
    print(daniel.tutor)
    print(daniel.firstName)
    print(daniel.lastName)

    println(Student.createPostGrad("Wiktoria"))
    println(Student.createUnderGrad("Daniel"))

}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}


open class Student(firstName: String, lastName: String, _id: Int) :
    Person(firstName, lastName) { // main.Person() is used to call the default constructor

    val id: Int = _id
    var tutor: String

    init {
        tutor = ""
    }

    constructor(
        firstName: String, lastName: String,
        _id: Int, tutor: String
    ) :
            this(firstName, lastName, _id) {
        this.tutor = tutor
    }

    override fun getName(): String {
        return ""
    }

    override fun getAddress(): String {
        return ""
    }

    fun enrole(courseName: String) {
        val course = Courses.allCourses
            .filter { it.title == courseName }
            .firstOrNull()
    }

    companion object : XmlSerializer<Student> {
        override fun toXml(item: Student) {
            print(Student)
        }

        fun createUnderGrad(name: String): UnderGrad {
            return UnderGrad(name)
        }

        fun createPostGrad(name: String): PostGrad {
            return PostGrad(name)
        }
    }
}


interface XmlSerializer<T> {
    fun toXml(item: T)
}


//open class main.Person { // open overrides the default final class behaviour and allows you to inherit from the class
//    var firstName : String = ""
//    var lastName : String = ""
//
//    open fun getName() : String = "$firstName $lastName" // same as above
//}


// TODO split main.Student and main.Person into separate files