package codewars

object PyramidArray {
  def pyramid(n: Int): List[List[Int]] = {
    List.tabulate(n)(i => List.fill(i + 1)(1))
  }
}