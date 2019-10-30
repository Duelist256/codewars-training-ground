package leetcode

object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val N = nums.length

    var i = 0;
    while (i < N) {
      var j = 0;
      while (j < N) {
        if (i != j && (nums(i) + nums(j) == target))
          return Array(i, j)
        j += 1;
      }
      i += 1;
    }

    Array.empty
  }
}
