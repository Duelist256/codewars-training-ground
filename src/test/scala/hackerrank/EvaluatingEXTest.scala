package hackerrank

import org.scalatest.FunSuite

class EvaluatingEXTest extends FunSuite {
  test("EvaluatingEX test") {
    assert(EvaluatingEX.evalEX(0) === 1)
    assert(EvaluatingEX.evalEX(1) === 2.7182815255731922)
    assert(EvaluatingEX.evalEX(2) === 7.3887125220458545)
    assert(EvaluatingEX.evalEX(20) === 2423600.1887125224)
  }

}
