package com.rockthejvm.part1basics

object CBNVsCBV {

  // CBV = call by value
  // args are evaluated before function invocation

  def aFunction(arg: Int): Int = arg + 1

  val aComputation = aFunction(12 + 234)

  // CBN = call by name
  // args passed as expression, evaluated at reference

  def byNameFunction(arg: => Int): Int = arg + 1

  val anotherComputation = byNameFunction(12 + 234)

  def printTwiceByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
  }

  // delayed evaluation of argument

  def printTwiceByName(x: => Long): Unit = {
    println("By name: " + x)
    println("By name: " + x)
  }

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  def main(args: Array[String]): Unit = {

    println(aComputation)
    println(anotherComputation)

    printTwiceByValue(System.nanoTime())
    printTwiceByName(System.nanoTime())

    printFirst(23, infinite())

  }

}
