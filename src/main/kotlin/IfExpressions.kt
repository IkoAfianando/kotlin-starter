fun main() {
    val openHours = 7
    val now = 7
    val office: String
    if(now > openHours) {
        office = "Office already open"
    } else if(now == openHours) {
        office = "Wait a Minute, Office will be open"
    } else {
        office = "Office is closed"
    }

    println(office)
}