package main

fun main() {
  var fibonacci = Fibonacci()
  fibonacci.calFibonacci(10, object : Process {
    override fun execute(value: Int) {
      println(value)
    }
  })

}

interface Process {
  fun execute(value: Int)
}

class Fibonacci {
  fun calFibonacci(limit: Int, action: Process){
    var prev = 0
    var prevprev = 0
    var current = 1

    for(i: Int in 1..limit) {
      action.execute(current)

      var temp = current
      prevprev = prev
      prev = temp
      current = prev + prevprev
    }
  }
}