package org.parikshankmpsample

import io.github.aryapreetam.parikshan.e2eTest
import kotlin.test.Test

class SimpleGreetTest {

  @Test
  fun testGreetingFlow() = e2eTest {
    // Step 1: Type the name into the input field
    input("name_input", "Parikshan") // (1)

    // Step 2: Click the Greet button
    click("Greet") // (2)

    // Step 3: Assert the greeting text is displayed
    assertVisible("Hello, Parikshan!") // (4)
  }
}