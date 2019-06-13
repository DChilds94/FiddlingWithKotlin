package main
class Course(val id: Int, val title: String) {

}

object Courses {
    var allCourses = arrayListOf<Course>()

    fun addCourses() {
        allCourses.add(Course(1, "Kotlin"))
    }
}

// object keyword is to create a singleton
// can be hard for testing and reuse
// an object is a class
// they can derive from other classes/interface
// can be declared in another class / nested in a class