/**
Selection Sort is a simple comparison-based sorting algorithm. It works by repeatedly selecting the smallest (or largest) element from the unsorted part of the array and placing it at the beginning.

How it works:
Start from the first element.

Find the minimum element in the unsorted part.

Swap it with the first unsorted element.

Move the boundary of the sorted part by one.

Repeat until the array is fully sorted.

Time & Space Complexity:

Time: O(n²) for all cases
Space: O(1) (in-place, no extra memory)
 
*/

fun main() {
    var input:IntArray = intArrayOf(87,83,98,23,53,46,65,11,34,90,35)
    selectionSort(input)
    println(input.joinToString(", "))
}

fun selectionSort(input:IntArray) {
   for(i in 0 until input.size - 1) {
       var min = i
       for(j in i+1 until input.size) {
           if(input[j]<input[min]) {
               min = j
           }
       }
           
       var temp = input[i] 
       input[i] = input[min]  
       input[min] = temp 
   }  
}