package codewars

import org.scalatest.FunSuite

class PyramidArrayTest extends FunSuite {
  test("Sample Tests") {
    assert(PyramidArray.pyramid(0) == List[List[Int]]())
    assert(PyramidArray.pyramid(1) == List[List[Int]](List(1)))
    assert(PyramidArray.pyramid(2) == List[List[Int]](List(1), List(1, 1)))
    assert(PyramidArray.pyramid(3) == List[List[Int]](List(1), List(1, 1), List(1, 1, 1)))
  }
}
