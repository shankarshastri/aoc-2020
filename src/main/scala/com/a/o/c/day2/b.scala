package com.a.o.c.day2

import scala.io.StdIn.readLine
import scala.util.Try

object b  extends App {

  case class Policy(i: Int, j: Int, c: Char, s: String)

  val s = Iterator
    .continually(readLine)
    .takeWhile(_.length != 0)
    .map(_.split(" "))
    .map(e => (e(0), e(1), e(2)))
    .map(e => (e._1.split("-").map(_.toInt), e._2.head, e._3))
    .map(e => Policy(e._1(0), e._1(1), e._2, e._3))
    .count(e => {
      Try(
      (e.s.charAt(e.i - 1) == e.c || e.s.charAt(e.j - 1) == e.c) &&
        (e.s.charAt(e.i - 1) != e.s.charAt(e.j - 1))).getOrElse(false)
    })

  println(s)

}
