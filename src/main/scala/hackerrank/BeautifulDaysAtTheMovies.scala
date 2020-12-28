package hackerrank

object BeautifulDaysAtTheMovies {

  def reverse(i: Int): Int = i.toString.reverse.toInt

  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    (i to j).foldLeft(0)((days, i) =>
      if (math.abs(i - reverse(i)) % k == 0) days + 1 else days)
  }
}
