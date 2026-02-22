// Kotlin Operators - Quick Reference Notes

// 1. ARITHMETIC OPERATORS
val a = 10
val b = 3

println(a + b) // Addition: 13

println(a - b) // Subtraction: 7

println(a * b) // Multiplication: 30

println(a / b) // Division: 3

println(a % b) // Modulo: 1

// 2. ASSIGNMENT OPERATORS
var x = 5

x += 3 // x = 8

x -= 2 // x = 6

x *= 2 // x = 12

x /= 3 // x = 4

x %= 2 // x = 0

// 3. COMPARISON OPERATORS
println(a == b) // Equal to: false

println(a != b) // Not equal to: true

println(a > b) // Greater than: true

println(a < b) // Less than: false

println(a >= b) // Greater or equal: true

println(a <= b) // Less or equal: false

// 4. LOGICAL OPERATORS
val p = true
val q = false

println(p && q) // AND: false

println(p || q) // OR: true

println(!p) // NOT: false

// 5. UNARY OPERATORS
var num = 5

num++ // Post-increment

++num // Pre-increment

num-- // Post-decrement

--num // Pre-decrement

-num // Negation

// 6. RANGE OPERATORS
val range1 = 1..5 // Inclusive range: [1,2,3,4,5]
val range2 = 1 until 5 // Exclusive range: [1,2,3,4]

// 7. IN OPERATOR
println(3 in 1..5) // true

println(3 !in 1..5) // false

println("kt" in "kotlin") // true

// 8. INSTANCEOF (is/!is OPERATORS)
val obj: Any = "Hello"

println(obj is String) // true

println(obj !is Int) // true

// 9. ELVIS OPERATOR (?:)
val nullValue: String? = null
val result = nullValue ?: "default" // Returns "default"

// 10. SAFE CALL OPERATOR (?.)
val text: String? = null

println(text?.length) // Returns null, doesn't throw exception

// 11. NOT-NULL ASSERTION OPERATOR (!!)
val str: String? = "Kotlin"

println(str!!.length) // Throws exception if null

// 12. BITWISE OPERATORS
println(5 and 3) // Bitwise AND: 1

println(5 or 3) // Bitwise OR: 7

println(5 xor 3) // Bitwise XOR: 6

println(5.inv()) // Bitwise NOT: -6

println(5 shl 1) // Left shift: 10

println(5 shr 1) // Right shift: 2
