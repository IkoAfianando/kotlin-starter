fun main() {
    val text = "Kotlin"

    for (char in text) {
        print("$char ")
    }
    val firstChar = text[0]

    println("First character of $text is $firstChar")

    escapedString()

    rawString()
}

fun escapedString() {
      val statement = "Kotlin is \"Awesome!\""
      println(statement)

//    val statement = "Kotlin is Awesome!" val statement = "Kotlin is "Awesome!""
//    \t: menambah tab ke dalam teks.
//    \n: membuat baris baru di dalam teks.
//    \’: menambah karakter single quote kedalam teks.
//    \”: menambah karakter double quote kedalam teks.
//    \\: menambah karakter backslash kedalam teks.

    val name = "Unicode test: \u00A9"
    println(name)
}

fun rawString() {
//    val line =  "Line 1\n" +
//                "Line 2\n" +
//                "Line 3\n" +
//                "line 4\n" +
//                "Line 5\n"
    // simple solution
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
        Line 5
    """.trimIndent()

    print(line)
}
