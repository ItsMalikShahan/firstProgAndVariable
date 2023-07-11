fun main() {
    val name = setOf("Ali", "Anwar", "Kashif", "Shahan", "Zain", "Kuhbab", "Ali")

    //println(name.toSortedSet())

    val modifiedNameList = name.toMutableList()
    modifiedNameList.add("Samina")
    modifiedNameList.add("Sundas")
    modifiedNameList.add("Anam")
    //println(modifiedNameList.toSortedSet())
    val daysOfWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    for (key in daysOfWeek.keys) {
        println(" $key has value ${daysOfWeek[key]}")
    }
}