package hackerrank

object ComputingTheGcd {
  @scala.annotation.tailrec
  def gcd(x: Int, y: Int): Int = {
    if (x > 0 && y > 0) {
      if (x == y) x
      else if (x > y) gcd(x - y, y)
      else gcd(y - x, x)
    } else {
      x + y
    }
  }
}
