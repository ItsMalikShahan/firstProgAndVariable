
fun main(){
    val month = listOf("January", "February", "March")
    val anyTypes = listOf(1, 3.5, 5, false, true, "String")
    print(anyTypes.size)
    val additionalMonth = month.toMutableList()
    val newMonth = listOf("April", "May", "June")
    additionalMonth.addAll(newMonth)
    additionalMonth.add("July")
    additionalMonth.add(3,"-----Summer Starts-------")
    for (months in additionalMonth){
        print("\n${months} ")
    }
    val days = mutableListOf<String>("Sun", "Mon", "Tue", "Wed")
    days.add("Thu")
    days.removeAt(3)
    val removelist = mutableListOf<String>("Sun", "Tue")
    days.removeAll(removelist)
    println(days)

}