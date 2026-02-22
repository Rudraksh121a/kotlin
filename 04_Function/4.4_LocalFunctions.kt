// Local function example

fun formatName(first: String, last: String): String {
    fun cap(s: String): String {
        if (s.isEmpty()) return s
        return s[0].uppercase() + s.substring(1).lowercase()
    }

    return cap(first) + " " + cap(last)
}
