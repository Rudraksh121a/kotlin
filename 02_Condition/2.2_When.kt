// When Expression in Kotlin

// WHY USE WHEN?
// 1. More readable than if-else chains
// 2. More powerful than switch in Java
// 3. Can match multiple conditions elegantly
// 4. Type-safe pattern matching

fun main() {
    // BASIC WHEN EXPRESSION
    val number = 2
    when (number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Other")
    }

    // MULTIPLE CONDITIONS IN ONE BRANCH
    val grade = 'A'
    when (grade) {
        'A', 'B' -> println("Good")
        'C', 'D' -> println("Average")
        else -> println("Fail")
    }

    // RANGE MATCHING
    val age = 25
    when (age) {
        in 0..12 -> println("Child")
        in 13..19 -> println("Teen")
        in 20..59 -> println("Adult")
        else -> println("Senior")
    }

    // WHEN AS EXPRESSION (returns value)
    val result =
            when (number) {
                1 -> "One"
                2 -> "Two"
                else -> "Other"
            }
    println(result)

    // TYPE CHECKING WITH WHEN
    val obj: Any = "Hello"
    when (obj) {
        is String -> println("String: $obj")
        is Int -> println("Integer: $obj")
        else -> println("Unknown type")
    }
}
