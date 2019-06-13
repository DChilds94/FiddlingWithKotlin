package main

fun main() {
  val functionalFibonacci = FunctionalFibonacci()
  var total = 0

  functionalFibonacci.calFibonacci(8) {it -> total += it}
  println(total)


}

class FunctionalFibonacci {
  fun calFibonacci(limit: Int, action: (Int) -> Unit){
    var prev = 0
    var prevprev = 0
    var current = 1

    for(i: Int in 1..limit) {
      action(current)

      var temp = current
      prevprev = prev
      prev = temp
      current = prev + prevprev
    }
  }
}