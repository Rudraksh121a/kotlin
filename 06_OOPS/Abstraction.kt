// Abstraction in Kotlin
// Demonstrates abstract classes and methods
//
// What is Abstraction?
// Abstraction is the concept of hiding implementation details and showing only essential features.
// In Kotlin, abstraction is achieved using abstract classes and methods.
// Abstract classes cannot be instantiated directly and may contain abstract methods (without body).
// Subclasses must provide implementations for abstract methods.

abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area() = Math.PI * radius * radius
}

// Usage example:
fun main() {
    val c = Circle(5.0)
    println(c.area())
}
