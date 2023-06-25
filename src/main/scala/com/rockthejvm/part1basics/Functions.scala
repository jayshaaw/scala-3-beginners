package com.rockthejvm.part1basics

object Functions {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  val aFunctionInvocation = aFunction("Scala", 2)

  def aNoArgFunction(): Int = 45

  def aParameterlessFunction: Int = 45

  // function can be recursive
  def stringConcatenation(str: String, n: Int): String = {
    if (n == 0) ""
    else if (n == 1) str
    else str + stringConcatenation(str, n - 1)
  }

  val scala3 = stringConcatenation("Scala", 3)

  val aString: String = "Scala"

  // when you need loops, use RECURSION

  def aVoidFunction(aString: String): Unit =
    println(aString)

  //
  def computeDoubleStrinWithASideEffect(aString: String): String = {
    aVoidFunction(aString) // Unit
    aString + aString // meaning value
  } // discouraging side effect

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int) = a + b

    aSmallerFunction(n, n + 1)
  }

  // 1
  def aGreetingFunction(name: String, age: Int): String = {
    "Hi my name is " + name + " and I am " + age + " years old."
  }

  // 2
  def factorialFunction(n: Int): Int = {
    if (n <= 0) then 0
    else if (n == 1) then 1
    else n * factorialFunction(n - 1)
  }

  // 3
  def fibonacciNumber(n: Int): Int = {
    if (n <= 2) then 1 // 0 1
    else fibonacciNumber(n - 1) + fibonacciNumber(n - 2)
  }

  //  4
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }


  def main(args: Array[String]): Unit = {
    println(aFunctionInvocation)
    println(scala3)
    val actualValue: Unit = aVoidFunction("Scala")
    println(actualValue)
    println("aGreetingFunction: " + aGreetingFunction("john", 50))
    println("factorialFunction: " + factorialFunction(5))
    println("fibonacciNumber: " + fibonacciNumber(5))
    println("isPrime: " + isPrime(71))
  }

}
