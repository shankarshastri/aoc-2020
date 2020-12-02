package com.a.o.c.day2

import scala.io.StdIn.readLine

object a extends App {

//  1-3 a: abcde
//  1-3 b: cdefg
//  2-9 c: ccccccccc


  case class Policy(i: Int, j: Int, c: Char, s: String)

  val s = Iterator
    .continually(readLine)
    .takeWhile(_.length != 0)
    .map(_.split(" "))
    .map(e => (e(0), e(1), e(2)))
    .map(e => (e._1.split("-").map(_.toInt), e._2.head, e._3))
    .map(e => Policy(e._1(0), e._1(1), e._2, e._3))
    .count(e => {
      val c = e.s.count(_ == e.c)
      e.i <= c && c <= e.j
    })

  println(s)
}
