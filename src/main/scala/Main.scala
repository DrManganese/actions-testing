package io.github.drmanganese.testing

object Main extends App {

  println(s"hi ${square(5)}")

  def square(i: Int): Int = i * i
}
