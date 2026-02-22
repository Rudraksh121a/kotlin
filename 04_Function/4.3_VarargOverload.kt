// Vararg and overloading

fun sumAll(vararg nums: Int): Int {
    var total = 0
    for (n in nums) {
        total += n
    }
    return total
}

fun area(radius: Double): Double {
    return 3.14159 * radius * radius
}

fun area(width: Double, height: Double): Double {
    return width * height
}
