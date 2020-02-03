package hackerrank

import scala.io.StdIn

object StringMingling {

  def stringMingling(s1: String, s2: String): String =
    s1.zip(s2).map { case (ch1, ch2) => s"$ch1$ch2" }.mkString

  def main(args: Array[String]): Unit = {
    val s1 = StdIn.readLine()
    val s2 = StdIn.readLine()

    println(stringMingling(s1, s2))
  }
}
