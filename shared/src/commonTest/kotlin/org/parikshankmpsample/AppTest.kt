package org.parikshankmpsample

import io.github.aryapreetam.parikshan.e2eTest
import kotlin.test.Test
import kotlin.time.Duration.Companion.milliseconds

class AppTest {
  @Test
  fun testDefaultApp() = e2eTest {
    // ensure 'Compose' is not visible before clicking the button
    assertNotVisible("Compose")
    // click the button
    click("Click me!")
    // check if 'Compose' is visible
    assertVisible("Compose")
  }
}