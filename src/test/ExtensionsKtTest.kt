package test

import main.replaceWhiteSpace
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ExtensionsKtTest {
//

  @Test
  fun shouldReplaceAllWhiteSpace() {
    assertEquals("A string with whitespace", replaceWhiteSpace(text))

  }

  @Test
  fun shouldReplaceAllWhiteSpaceWhenCallingReplaceWhiteSpaceAsAStringUtilFunction() {

  }

  @BeforeTest
  companion object {
    fun init() {
      var text = "A  string  with  whitespace" //two spaces separate this string
    }
  }

}