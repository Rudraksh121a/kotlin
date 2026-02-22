// Kotlin Functions - Notes (overview)
// ----------------------------------
// Function syntax: fun name(param: Type): ReturnType { ... }
// - Return type is optional if it can be inferred.
// - Use Unit for no return (can be omitted).
//
// Concepts are split into separate files:
// 4.2_BasicFunctions.kt  -> basic, single-expression, default args, Unit
// 4.3_VarargOverload.kt  -> vararg, overloading
// 4.4_LocalFunctions.kt  -> local function
// 4.5_HigherOrder.kt     -> higher-order functions, lambda
// 4.6_Recursion.kt       -> tail recursion
// 4.7_Extension.kt       -> extension function
//
// Quick demo
fun main() {
    println(add(2, 3))
    println(multiply(4, 5))
    println(greet())
    println(greet(name = "Asha"))
    printLine("Kotlin functions")
    println(sumAll(1, 2, 3, 4))
    println(area(3.0))
    println(area(4.0, 5.0))
    println(formatName("joHN", "doE"))
    println(operate(10, 4, subtract))
    println(factorial(5))
    println("Kotlin".lastChar())
}
