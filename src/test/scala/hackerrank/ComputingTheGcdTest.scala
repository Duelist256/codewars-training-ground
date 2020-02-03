package hackerrank

import org.scalatest.FunSuite

class ComputingTheGcdTest extends FunSuite {
  test("ComputingTheGcdTest") {
    assert(ComputingTheGcd.gcd(1, 5) === 1)
    assert(ComputingTheGcd.gcd(10, 100) === 10)
    assert(ComputingTheGcd.gcd(22, 131) === 1)
  }

}
