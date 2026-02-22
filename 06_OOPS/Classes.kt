// Classes in Kotlin
// Demonstrates basic class structure, properties, and methods
//
// What is a Class?
// A class is a blueprint for creating objects. It defines properties and functions (methods).
// Classes encapsulate data and behavior. Objects are instances of classes.

class Person(val name: String, var age: Int) {
    fun greet() = println("Hello, my name is $name and I am $age years old.")
}

// Usage example:
fun main() {
    val p = Person("Ravi", 25)
    p.greet()
}
