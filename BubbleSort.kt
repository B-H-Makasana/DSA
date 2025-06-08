/**
Compare each pair of adjacent elements.

If the first element is greater than the second, swap them.

Repeat this for every pair until the largest element is at the end.

Do the same for the remaining elements (ignoring the sorted part at the end).

Keep repeating until no swaps are needed.

 */

fun main() {
    var input = intArrayOf(12,45,63,23,10,56,22,54,62,89,67)
    bubbleSort(input)
    println("Sorted Array")
    input.forEach {
      print("$it ")
    }
}

fun bubbleSort(nums:IntArray) {
 for(i in 0 until nums.size) {
    for(j in 0 until nums.size - i-1) {
        if(nums[j] > nums[j+1]) {
            var temp = nums[j]
            nums[j] = nums[j+1]
            nums[j+1] = temp
            }
        }
    }
}