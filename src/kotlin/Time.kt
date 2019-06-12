interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0) // this acts as the default method which allows you to expand the interface in the future
    fun setTime(time: myTime) = setTime(time.hours) // example of expanding the interface using the default method
}



class MyTime {
    var hours: Int = 0
    var mins: Int = 0
    var secs: Int = 0
}

class YetiTime : Time { // the colon indicate that we are implementing an interface
   override fun setTime(hours: Int, mins: Int, secs: Int) { // override is used to declare that we are using the default method in the interface

   }
}