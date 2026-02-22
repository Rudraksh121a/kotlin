// Polymorphism in Kotlin
// Demonstrates method overriding and dynamic dispatch
//
// What is Polymorphism?
// Polymorphism allows objects to be treated as instances of their parent class rather than their
// actual class.
// It enables a single interface to represent different types.
// Method overriding is a key aspect of polymorphism.

open class Vehicle {
    open fun drive() = println("Driving vehicle")
}

class Car : Vehicle() {
    override fun drive() = println("Driving car")
}

// Usage example:
fun main() {
    val v: Vehicle = Car()
    v.drive()
}
