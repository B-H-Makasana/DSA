/**
Quick Sort is a fast and efficient divide-and-conquer sorting algorithm. It works by choosing a pivot element and partitioning the array so that elements smaller than the pivot go to the left, and larger ones to the right. Then it recursively sorts the left and right parts.

How it works:
Choose a pivot element.

Rearrange elements: left < pivot, right > pivot.

Recursively apply the same steps to left and right subarrays.

Time & Space Complexity:
Best & Average case: O(n log n)

Worst case (bad pivot): O(n²)

Space: O(log n) (recursive calls)

Stable: ❌ No (can be made stable with extra effort)

*/

fun main() {
    var input:IntArray = intArrayOf(87,83,98,23,53,46,65,11,34,90,35)
    quickSort(input,0,input.size-1)   
    input.forEach{
        print("$it ")
    }
}

fun partition(arr:IntArray,start:Int,end:Int):Int {
    var pivot = arr[end]
    var pIndex = start -1
    for(i in start..end-1) {
        if(arr[i]<pivot) {
            pIndex++
            var temp = arr[pIndex]
            arr[pIndex] = arr[i]
            arr[i] = temp
        } 
    }
    arr[end] = arr[pIndex+1]
    arr[pIndex+1] = pivot
    return pIndex+1
}

fun quickSort(arr:IntArray,start:Int,end:Int) {
    if(start<end) {
       var pivot = partition(arr,start,end)
       quickSort(arr,start,pivot-1)
       quickSort(arr,pivot+1,end)   
    }
}