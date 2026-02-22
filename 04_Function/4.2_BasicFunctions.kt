// Basic functions, single-expression, default args, Unit

fun add(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int) = a * b

fun greet(name: String = "Guest"): String {
    return "Hello, $name"
}

// Named args example: greet(name = "Ravi")

fun printLine(message: String) {
    println(message)
}

// Example usage
fun main() {
    println(add(2, 3))                // 5
    println(multiply(4, 5))           // 20
    println(greet())                  // Hello, Guest
    println(greet(name = "Ravi"))     // Hello, Ravi
    printLine("This is a line.")      // This is a line.
}
