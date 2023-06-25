package com.rockthejvm.part1basics

object Expressions {

  val meaningOfLife: Int = 40 + 2

  // mathematical operations

  val checkEquality: Boolean = 1 == 2

  // instruction vs expressions
  // instruction are executed
  // expressions are evaluated
  // we think in terms of expressions

  // ifs are expressions
  val aCondition = true

  val anIfExpression: Int = if (aCondition) 45 else 99

  // code block

  val aCodeBlock = {
    // local values
    val localValue = 67
    // expression

    // last express = value of the block
    /*return*/ localValue + 54
  }

  // everything in Scala is an expression

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  val yetAnotherValue: Unit = println("Scala")

  val theUnit: Unit = ()

  def main(args: Array[String]): Unit = {
    println("meaningOfLife: " + meaningOfLife)
    println("someValue: " + someValue)
    println("someOtherValue: " + someOtherValue)
    println("yetAnotherValue: " + yetAnotherValue)

  }

}
