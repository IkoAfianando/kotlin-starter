fun main() {
    val intArray = intArrayOf(1,3,5,7)
    intArray[2] = 11
    println(intArray[2])
    array()

//Fungsi Spesifik pembuatan Array
//intArrayOf() : IntArray
//booleanArrayOf() : BooleanArray
//charArrayOf() : CharArray
//longArrayOf() : LongArray
//shortArrayOf() : ShortArray
//byteArrayOf() : ByteArray
}

fun array() {
    val arrayname = Array(size = 5, init = { i -> i * i })
    for (element in arrayname) {
        println(element)
    }
}