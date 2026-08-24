package org.parikshankmpsample

import io.github.aryapreetam.parikshan.e2eTest
import kotlin.test.Test

class AppTest {
  @Test
  fun testDefaultApp() = e2eTest {
    click("Click me!")
    assertVisible("Compose")
  }
}