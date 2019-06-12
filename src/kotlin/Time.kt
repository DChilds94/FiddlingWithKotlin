interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0) // this acts as the default method which allows you to expand the interface in the future
    fun setTime(time: MyTime) = setTime(time.hours) // example of expanding the interface using the default method
}

interface EndOfTheWorld {
 fun setTime(time: MyTime) {}
}

class MyTime {
    var hours: Int = 0
    var mins: Int = 0
    var secs: Int = 0
}

class YetiTime : Time, EndOfTheWorld { // the colon indicate that we are implementing an interface - if there's more than one interface simply common separate

    override fun setTime(time: MyTime) {
        super<Time>.setTime(time)
        super<EndOfTheWorld>.setTime(time)
    }
    override fun setTime(hours: Int, mins: Int, secs: Int) { // override is used to declare that we are using the default method in the interface

   }
}