/*
    Kotlin Array Notes

    1. Array Creation
*/
val arr1 = arrayOf(1, 2, 3) // Generic array
val arr2 = intArrayOf(1, 2, 3) // Primitive int array
val arr3 = Array(5) { it * 2 } // Array with lambda initializer
val arr4 = Array<String>(3) { "Hello" } // Array of Strings

/*
    2. Accessing Elements
*/
val first = arr1[0] // Get element at index 0

arr1[1] = 10 // Set element at index 1

/*
    3. Array Properties
*/
val size = arr1.size // Get array size
val isEmpty = arr1.isEmpty() // Check if array is empty

/*
    4. Iteration
*/
for (element in arr1) {
    println(element)
}

arr1.forEach { println(it) }

for (i in arr1.indices) {
    println(arr1[i])
}

/*
    5. Common Operations
*/
val contains = arr1.contains(2) // true if 2 is in array
val index = arr1.indexOf(10) // index of 10, -1 if not found
val lastIndex = arr1.lastIndex // last valid index

/*
    6. Copying Arrays
*/
val copy = arr1.copyOf() // Copy entire array
val copy2 = arr1.copyOf(5) // Copy with new size
val copyRange = arr1.copyOfRange(1, 3) // Copy from index 1 to 2

/*
    7. Sorting
*/
val sorted = arr1.sortedArray() // Returns new sorted array

arr1.sort() // Sorts in-place

/*
    8. Reversing
*/
val reversed = arr1.reversedArray() // Returns new reversed array

arr1.reverse() // Reverses in-place

/*
    9. Filling
*/
arr1.fill(0) // Fill all elements with 0

/*
    10. Filtering & Mapping
*/
val filtered = arr1.filter { it > 1 }.toTypedArray()
val mapped = arr1.map { it * 2 }.toTypedArray()

/*
    11. Aggregation
*/
val sum = arr1.sum()
val avg = arr1.average()
val max = arr1.maxOrNull()
val min = arr1.minOrNull()

/*
    12. Multi-dimensional Arrays
*/
val matrix = Array(3) { IntArray(3) } // 3x3 matrix

/*
    13. Conversion
*/
val list = arr1.toList() // Array to List
val arrFromList = list.toTypedArray() // List to Array

/*
    14. Destructuring
*/
val (a, b, c) = arr1 // Only works for arrays with at least 3 elements

/*
    15. Other Useful Functions
*/
val joined = arr1.joinToString(", ") // Join elements as String
val distinct = arr1.distinct() // Remove duplicates (returns List)
