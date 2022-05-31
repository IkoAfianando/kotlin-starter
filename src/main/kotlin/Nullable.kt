fun main() {
    // tanpa menggunakan (?)
    // val text: String = null // error
    // menggunakan (?) berarti boleh null
    val text: String? = null
    println(text)

    // agar kompile mengizinkan nilai tersebut diakses sebagai null kita dapat menggunakan if/else
    if(text != null) {
        val textLength = text.length
        println(textLength)
    }
}