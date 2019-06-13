package test

import main.max
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


class ExpressionsKtTest {

  @Test
  fun maxShouldReturnTheGreaterNumber() {
    assertEquals(10, max(10, 2))
    assertEquals(7, max(7, 2))
    assertEquals(20, max(10, 20))
  }
}
