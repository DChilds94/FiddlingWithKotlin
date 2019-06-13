package test

import main.display
import main.log
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ProgramTest {

    @Test
    fun displayReturnsTheCorrectString() {
        var name = "Daniel"
        assertEquals("Hello, Daniel", display(name))
    }

    @Test
    fun logShouldDisplayTheCorrectMessageAndDefaultLogLevel() {
        assertEquals("The current logging level is 1", log())
    }

    @Test
    fun logShouldDisplayTheCorrectMessageAnsDisplayTheLogLevelPassedIn() {
        assertEquals("The current logging level is 21", log(21))
    }

}