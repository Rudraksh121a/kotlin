// Inheritance in Kotlin
// Demonstrates open, override, and super
//
// What is Inheritance?
// Inheritance allows a class to acquire properties and methods of another class.
// The base class must be marked 'open' to be inherited.
// Subclasses can override methods and properties.

open class Animal {
    open fun sound() = println("Some sound")
}

class Dog : Animal() {
    override fun sound() = println("Bark")
}

// Usage example:
fun main() {
    val a: Animal = Dog()
    a.sound()
}
