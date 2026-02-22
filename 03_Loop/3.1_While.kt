// ===== WHILE LOOP =====
// Syntax: while (condition) { ... }
// Executes code block while condition is TRUE
// Checks condition BEFORE executing body

fun whileLoopExample() {
    var count = 0
    while (count < 5) {
        println("Count: $count")
        count++
    }
    // Output: 0, 1, 2, 3, 4
}

// Infinite while loop (use break to exit)
fun infiniteWhile() {
    var x = 0
    while (true) {
        println(x)
        x++
        if (x > 5) break
    }
}

// ===== DO-WHILE LOOP =====
// Syntax: do { ... } while (condition)
// Executes code block FIRST, then checks condition
// Guarantees at least ONE execution

fun doWhileExample() {
    var count = 0
    do {
        println("Count: $count")
        count++
    } while (count < 5)
    // Output: 0, 1, 2, 3, 4
}

// Key Difference Example
fun keyDifference() {
    // While - won't execute if condition is false initially
    var x = 10
    while (x < 5) {
        println("While: $x") // This won't print
    }

    // Do-While - executes at least once
    var y = 10
    do {
        println("Do-While: $y") // This WILL print once
    } while (y < 5)
}

// ===== CONTROL STATEMENTS =====
// break - exits the loop
// continue - skips current iteration

fun controlStatements() {
    // Using break
    var i = 0
    while (i < 10) {
        if (i == 5) break
        println(i)
        i++
    }

    // Using continue
    var j = 0
    while (j < 5) {
        j++
        if (j == 2) continue
        println(j)
    }
}