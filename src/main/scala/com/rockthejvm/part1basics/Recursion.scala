package com.rockthejvm.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion {

  //
  def sumUntil(n: Int): Int =
    if (n <= 0) 0
    else n + sumUntil(n - 1)

  def sumUntil_v2(n: Int): Int = {
    def sumUntilTrailrec(x: Int, accumulator: Int): Int =
      if (x <= 0) accumulator
      else sumUntilTrailrec(x - 1, accumulator + x) // TAIL recursion - recursive call occurs LAST in its code path

    sumUntilTrailrec(n, 0)
  }

  def sumNumbersBetween_v2(a: Int, b: Int): Int = {
    @tailrec
    def sumUntil(x: Int, accumulator: Int): Int = {
      if (x > b) accumulator
      else sumUntil(x + 1, x + accumulator)
    }

    sumUntil(a, 0)
  }

  // 1 - concat a string n times

  def concatStringNTimes(s: String, n: Int) = {

    @tailrec
    def accumString(a: String, b: Int, resultString: String): String =
      if (b >= n) resultString
      else accumString(s, b + 1, resultString + a)

    accumString(s, 0, "")
  }

  // 2 - fibonacci function - tail recursive

  def fibonnaci(n: Int) = {

    @tailrec
    def accFibb(a: Int, last: Int, previous: Int): Int = {
      if (a >= n) last
      else
        accFibb(a + 1, last + previous, last)
    }

    if (n <= 2) 1
    else accFibb(2, 1, 1)
  }

  // 3 - is isPrime function tail recursive - if not write one
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  def main(args: Array[String]): Unit = {
    //    println(sumUntil(10000000))
    println(sumUntil_v2(20000))
    println(sumNumbersBetween_v2(1, 5))
    println(concatStringNTimes("Wo", 3))
    println(fibonnaci(7))
  }
}
