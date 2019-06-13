package main

import java.util.*

class Meeting {
  var title: String = ""
  var time: Date = Date()
  var who = mutableListOf<String>()

  fun create(){}
}

fun main() {
  val meeting = Meeting()
  meeting.title = "Not another meeting"
  meeting.time = Date(2019, 20, 6)
  meeting.who.add("Daniel")

  with(meeting) {
    title = "Some Meeting"
    time = Date(2019, 21, 6)
    who.add("Daniel")
  }

  meeting.apply {
    title = "Da Meeting"
    time = Date(2019, 22, 6)
    who.add("Daniel")
  }.create() // this will build the object for you. Apply is used on the receiver in this case the meeting.
}