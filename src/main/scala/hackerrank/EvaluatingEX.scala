package hackerrank

import scala.annotation.tailrec

object EvaluatingEX {

  def evalEX(x: Double): Double = {
    x match {
      case 0 => 1D
      case n => 1 + (1 until 10).foldLeft(0D) { case (x, y) =>
        x + math.pow(n, y) / factorial(y)
      }
    }
  }

  private def factorial(x: Int): Int = {
    @tailrec
    def factHelper(x: Int, acc: Int): Int = {
      x match {
        case n if n <= 1 => acc
        case n => factHelper(n - 1, acc * n)
      }
    }

    factHelper(x, 1)
  }


  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    for (_ <- 1 to n) {
      val x = stdin.readLine.trim.toDouble
      println(evalEX(x))
    }
  }
}
