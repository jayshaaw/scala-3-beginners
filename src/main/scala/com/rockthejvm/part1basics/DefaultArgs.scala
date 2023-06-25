package com.rockthejvm.part1basics

import scala.annotation.tailrec

object DefaultArgs {

  @tailrec
  def sumUntilTrailrec(x: Int, accumulator: Int = 0): Int =
    if (x <= 0) accumulator
    else sumUntilTrailrec(x - 1, accumulator + x) // TAIL recursion - recursive call occurs LAST in its code path


  val sumUntil100 = sumUntilTrailrec(100)

  def savePicture(dirPath: String, name: String, format: String = "jpg", width: Int = 1920, height: Int = 1000): Unit =
    println("Saving picture in format " + format + " in path " + dirPath)

  def main(args: Array[String]): Unit = {

    savePicture("./Documents/scala/scala-3-begineers/temp/", "myphoto")

  }

}
