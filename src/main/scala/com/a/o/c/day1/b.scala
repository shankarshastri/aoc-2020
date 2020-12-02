package com.a.o.c.day1

import scala.io.StdIn.readLine

object b extends App {

  /**
   * Lazy to write, but know that its three sum problem.
   * */

  val s = Iterator
    .continually(readLine)
    .takeWhile(_.length != 0).map(_.toInt).toList

  println(for {
    a <- s
    b <- s
    c <- s
    if a + b + c == 2020
  } yield (a * b * c))
}
