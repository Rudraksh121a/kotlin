// ============================================
// 2.1 If-Else Conditions in Kotlin
// ============================================

// 1. Basic If-Else Statement
fun basicIfElse() {
    val age = 18
    if (age >= 18) {
        println("You are an adult")
    } else {
        println("You are a minor")
    }
}

// 2. If-Else If-Else Chain
fun ifElseIfChain() {
    val score = 75
    if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else if (score >= 70) {
        println("Grade: C")
    } else {
        println("Grade: F")
    }
}

// 3. If Expression (Returns a Value)
fun ifAsExpression() {
    val number = 10
    val result = if (number > 0) "Positive" else "Non-positive"
    println(result)
}

// 4. Nested If-Else
fun nestedIfElse() {
    val age = 25
    val hasLicense = true
    if (age >= 18) {
        if (hasLicense) {
            println("Can drive")
        } else {
            println("Need a license")
        }
    } else {
        println("Too young to drive")
    }
}

fun main() {
    basicIfElse()
    ifElseIfChain()
    ifAsExpression()
    nestedIfElse()
}
