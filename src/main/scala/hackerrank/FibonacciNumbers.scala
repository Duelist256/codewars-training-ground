package hackerrank

object FibonacciNumbers {

  def fibonacci(x: Int): Int = {
    @scala.annotation.tailrec
    def fibonacciHelper(prev: Int, next: Int, x: Int): Int =
      if (x > 1) fibonacciHelper(next, prev + next, x - 1)
      else prev
    fibonacciHelper(0, 1, x)
  }

}
