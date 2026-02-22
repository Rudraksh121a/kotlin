// Higher-order function and lambda

fun operate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

val subtract: (Int, Int) -> Int = { x, y -> x - y }
