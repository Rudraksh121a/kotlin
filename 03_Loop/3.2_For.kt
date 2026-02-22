/**
 * Iterates through a collection of elements and performs an action on each element.
 *
 * The for loop executes the block of code for every item in the collection, making it ideal for:
 * - Processing each element sequentially
 * - Performing transformations or side effects on collection items
 * - Building results based on multiple elements
 *
 * @note In Kotlin, the for loop uses the `in` operator to iterate over ranges, arrays, lists, and
 * other iterables
 * @note The loop variable is immutable (val) within the loop scope
 * @note For loops can be used with destructuring to unpack data classes or pairs
 * @note Break and continue statements work with for loops to control flow
 * @note Nested for loops require labels if you want to break/continue on outer loops
 */
fun main() {
    println("=== Simple List Iteration ===")
    val fruits = listOf("Apple", "Banana", "Orange")
    for (fruit in fruits) {
        println("• $fruit")
    }

    println("\n=== Iteration with Index ===")
    for ((index, fruit) in fruits.withIndex()) {
        println("${index + 1}. $fruit")
    }

    println("\n=== Range Iteration ===")
    for (i in 1..5) {
        println("Number: $i")
    }

    println("\n=== Map Iteration with Destructuring ===")
    val person = mapOf("name" to "John", "age" to "30", "city" to "NYC")
    for ((key, value) in person) {
        println("$key = $value")
    }

    println("\n=== Control Flow (break/continue) ===")
    for (i in 1..10) {
        if (i == 3) continue
        if (i == 8) break
        print("$i ")
    }
    println("\n")

    println("=== Reverse Range ===")
    for (i in 5 downTo 1) {
        println("Countdown: $i")
    }

    println("\n=== Range with Step ===")
    for (i in 1..10 step 2) {
        print("$i ")
    }
}
