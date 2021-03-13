package io.github.drmanganese.testing

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

class MainTest extends AnyFunSuite with Matchers {

  test("square should square") {
    Main.square(10) mustBe 100
  }
}
