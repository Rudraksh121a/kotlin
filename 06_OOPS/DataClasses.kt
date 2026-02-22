// Data Classes in Kotlin
// Demonstrates concise syntax for classes holding data
//
// What is a Data Class?
// Data classes are classes that are used to hold data.
// They automatically provide equals(), hashCode(), toString(), and copy() methods.
// Use 'data' keyword to declare a data class.

data class User(val name: String, val age: Int)

// Usage example:
fun main() {
    val u1 = User("Ravi", 25)
    val u2 = User("Ravi", 25)
    println(u1 == u2) // true
    println(u1)
}
