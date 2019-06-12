
//open class Person { // open overrides the default final class behaviour and allows you to inherit from the class
//    var firstName : String = ""
//    var lastName : String = ""
//
//    open fun getName() : String = "$firstName $lastName" // same as above
//}

abstract class Person {
    var firstName : String = ""
    var lastName : String = ""

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String
}


class Student : Person() { // Person() is used to call the default constructor
    override fun getName() : String{return ""}

    override fun getAddress(): String {
        return ""
    }
}