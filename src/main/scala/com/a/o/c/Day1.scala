package com.a.o.c
import zio.{ExitCode, URIO}

object Day1 extends zio.App {
  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
    zio.console.putStrLn("Welcome To AOC").exitCode
}
