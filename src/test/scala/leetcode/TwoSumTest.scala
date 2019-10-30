package leetcode

import org.scalatest.FunSuite

class TwoSumTest extends FunSuite {
  test("TwoSum") {
    assert(TwoSum.twoSum(Array(2, 7, 11, 15), 9) === Array(0, 1))
    assert(TwoSum.twoSum(Array(3, 2, 4), 6) === Array(1, 2))
  }
}
