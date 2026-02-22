// Encapsulation in Kotlin
// Demonstrates visibility modifiers and property access
//
// What is Encapsulation?
// Encapsulation is the concept of bundling data and methods that operate on that data within a
// class.
// It restricts direct access to some of the object's components, using visibility modifiers
// (private, protected, public).

class Account(private var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
    }
    fun getBalance() = balance
}

// Usage example:
fun main() {
    val acc = Account(1000.0)
    acc.deposit(500.0)
    println(acc.getBalance())
}
