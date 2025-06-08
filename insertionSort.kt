/**
Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time. It works the same way you might sort playing cards in your hands.

How it works:
Start from the second element.

Compare it with the elements before it.

Shift larger elements one position to the right.

Insert the current element into its correct position.

Repeat until the array is sorted.

Time & Space Complexity:

Best case (already sorted): O(n)
Average/Worst case: O(n²)
Space: O(1) (in-place)
*/

fun main() {
    var input:IntArray = intArrayOf(87,83,98,23,53,46,65,11,34,90,35)
    insertionSort(input)
    println(input.joinToString(", "))
}

fun insertionSort(input:IntArray) {
   for(i in 0 until input.size) {
      var current = input[i]
      var index = i
      while(index > 0 && input[index-1] > current) {
          input[index] = input[index-1]
          index --
      }
      input[index] = current
   }
}