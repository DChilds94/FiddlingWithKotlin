package test

import main.Header
import main.plus
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class InfixKtTest {

  @Test
  fun shouldConcatTheHeadersNamesTogether() {
    val h1 = Header("Header 1")
    val h2 = Header("Header 2")

    var result = h1 plus h2
    println(result)
    assertEquals(result, h1.plus(h2))
    assertEquals(result, h1 + h2)
  }
}