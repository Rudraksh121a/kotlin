// Nested and Inner Classes in Kotlin
// Demonstrates nested and inner class usage
//
// What are Nested and Inner Classes?
// Nested classes are defined within another class and do not have access to the outer class.
// Inner classes are defined with the 'inner' keyword and can access members of the outer class.

class Outer {
    class Nested {
        fun foo() = println("Nested class")
    }
    inner class Inner {
        fun bar() = println("Inner class")
    }
}

// Usage example:
fun main() {
    val nested = Outer.Nested()
    nested.foo()
    val outer = Outer()
    val inner = outer.Inner()
    inner.bar()
}
