package codewars

object Roman {
  def decode(roman: String): Int =
    processNumbers(roman.map(romanLiteralToNumber _).toList).sum

  private def romanLiteralToNumber(ch: Char): Int =
    ch match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
    }

  private def processNumbers(numbers: List[Int]): List[Int] =
    numbers match {
      case x :: y :: rest if x < y => (y - x) :: processNumbers(rest)
      case x :: rest => x :: processNumbers(rest)
      case Nil => Nil
    }
}
