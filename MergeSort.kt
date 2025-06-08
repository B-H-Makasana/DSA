/**
Merge Sort is a fast, efficient, and stable divide-and-conquer sorting algorithm. It works by recursively dividing the array into halves, sorting each half, and then merging the sorted halves back together.

How it works:
Divide the array into two halves.

Recursively sort each half.

Merge the two sorted halves into a single sorted array.

Time & Space Complexity:
Best, Average, Worst case: O(n log n)
Space: O(n) (extra space for merging)

*/
fun main() {
    var input:IntArray = intArrayOf(87,83,98,23,53,46,65,11,34,90,35)

    mergeSort(input,0,input.size-1)
     
    println(input.joinToString(" "))
 
}
fun mergeSort(arr :IntArray,l :Int,r:Int) {
    var m = (r+l)/2
    if(l<r) {
        mergeSort(arr,l,m)
        mergeSort(arr,m+1,r)
     
        merge(arr,l,m,r)
    }
}

fun merge(arr :IntArray,l :Int,m:Int,r:Int) {
    var n1 = m-l+1
    var n2 = r-m

    var temp1 = IntArray(n1)
    var temp2 = IntArray(n2)
    
    for(i in 0..n1-1) {
        var p = arr[l+i]
        temp1[i] = p
    }
    
    for(j in 0..n2-1) {
        var p = arr[m+j+1]
        temp2[j] = p
    }

    var k = l
    var i = 0
    var j = 0
    
    while(i<n1 && j<n2) {
        if(temp1[i] < temp2[j]) {
            arr[k] = temp1[i]
            i = i+1
        } else {
           arr[k] = temp2[j]
            j = j +1
        }
        k = k+1
    }
    
    while(i<n1) {
        arr[k] = temp1[i]
        i++
        k++
    }
    
    while(j<n2) {
        arr[k] = temp2[j]
        j++
        k++
    }
}