package hackerrank

import org.scalatest.FunSuite

class FibonacciNumbersTest extends FunSuite {
  test("FibonacciNumbersTest") {
    assert(FibonacciNumbers.fibonacci(3) === 1)
    assert(FibonacciNumbers.fibonacci(4) === 2)
    assert(FibonacciNumbers.fibonacci(5) === 3)
  }

}
