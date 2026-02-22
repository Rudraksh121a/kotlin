fun main() {
    // Variables: containers for storing data values
    // Syntax: var name: DataType = value
    // Note: DataType is optional (compiler infers from assigned value)

    var a: Int = 14 // Integer variable
    var b: Double = 14.23 // Floating-point variable with decimal
    var c: String = "Rudra" // Text/String variable
    var d: Boolean = true // Boolean variable
    var e: Byte = 127 // Byte variable
    var f: Short = 32000 // Short variable
    var g: Long = 9223372036854775807L // Long variable
    var h: Float = 3.14f // Float variable
    var i: Char = 'K' // Character variable

    // String interpolation examples:
    // It used to embed variables directly in strings using $variableName
    println("Int: $a")
    println("Double: $b")
    println("String: $c")
    println("Boolean: $d")
    println("Byte: $e")
    println("Short: $f")
    println("Long: $g")
    println("Float: $h")
    println("Char: $i")
    
    // Advanced string interpolation with expressions:
    println("Sum of a and e: ${a + e}")
    println("Name in uppercase: ${c.uppercase()}")
    println("Multiple variables: $a, $b, $c")
}
