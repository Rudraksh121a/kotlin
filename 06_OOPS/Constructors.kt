// Constructors in Kotlin
// Primary and secondary constructors
//
// What is a Constructor?
// Constructors are special functions used to initialize objects.
// Kotlin supports primary and secondary constructors.
// Primary constructor is part of the class header; secondary constructors provide additional
// initialization.

class Student(val name: String, val roll: Int) {
    var grade: String = ""

    constructor(name: String, roll: Int, grade: String) : this(name, roll) {
        this.grade = grade
    }
}

// Usage example:
fun main() {
    val s1 = Student("Ravi", 1)
    val s2 = Student("Ravi", 1, "A")
    println(s1.name)
    println(s2.grade)
}
