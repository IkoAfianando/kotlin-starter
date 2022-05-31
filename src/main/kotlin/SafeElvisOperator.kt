fun main() {

}

fun safeCallsOperator() {
    // Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.
    val text: String? = null
    text?.length
}

fun elvisOperator() {
    // Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
    val text: String? = null
    val textLength = text?.length ?: 7
    // kode tersebut sama dengan
    val textL = if (text != null) text.length else 7
}