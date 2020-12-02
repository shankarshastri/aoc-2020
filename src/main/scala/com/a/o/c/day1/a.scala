package com.a.o.c.day1

import scala.io.StdIn.readLine

object a extends App {
  /**
   * Two-Sum Problem
   */
  val s = Iterator
    .continually(readLine)
    .takeWhile(_.length != 0).map(_.toInt).toSet

  println(s.filter(e => s.contains(2020 - e)).product)
}
