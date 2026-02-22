// Singleton in Kotlin
// Demonstrates object keyword for singletons
//
// What is a Singleton?
// Singleton is a design pattern that restricts the instantiation of a class to one object.
// In Kotlin, the 'object' keyword is used to declare a singleton.

object Logger {
    fun log(msg: String) = println("Log: $msg")
}

// Usage example:
fun main() {
    Logger.log("This is a log message.")
}
