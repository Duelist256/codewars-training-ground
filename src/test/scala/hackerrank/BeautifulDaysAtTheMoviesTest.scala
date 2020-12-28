package hackerrank

import hackerrank.BeautifulDaysAtTheMovies.beautifulDays
import org.scalatest.FunSuite

class BeautifulDaysAtTheMoviesTest extends FunSuite {
  test("BeautifulDaysAtTheNumbers") {
    assert(beautifulDays(20, 23, 6) === 2)
  }
}
