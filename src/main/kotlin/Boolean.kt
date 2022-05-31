fun main() {

    conjunctionAnd()
    conjunctionOr()
    negationNot()
}

fun conjunctionAnd() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
    val isOpen = now in officeOpen..officeClosed

    println("Office is Open: $isOpen")
}

fun conjunctionOr() {
    val officeOpen = 10
    val officeClosed = 17
    val now = 18
    val isOpen = now >= officeOpen || now <= officeClosed

    println("Office is Open: $isOpen")
}

fun negationNot() {
    val officeOpen = 10
    val now = 13
    val isOpen = now > officeOpen
    if(!isOpen) {
        println("Office is Closed")
    }else {
        println("Office is Open")
    }

}