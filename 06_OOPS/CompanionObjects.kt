// Companion Objects in Kotlin
// Demonstrates static-like members
//
// What is a Companion Object?
// Companion objects are used to define static members inside a class.
// They are initialized when the class is loaded and can be accessed without creating an instance.

class MathUtil {
    companion object {
        fun square(x: Int) = x * x
    }
}

// Usage example:
fun main() {
    println(MathUtil.square(5))
}
