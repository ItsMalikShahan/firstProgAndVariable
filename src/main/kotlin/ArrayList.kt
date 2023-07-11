

fun main(){
    val arrlist = ArrayList<Double>()
    arrlist.add(1.0)
    arrlist.add(4.9)
    arrlist.add(4.5)
    arrlist.add(15.6)
    arrlist.add(1.97)
    var temp  = 0.0
    for (i in arrlist)
    {
        temp += i
    }
    println("Sum of all values of array list is $temp")
    println("Average of all values of arraylist is ${temp/arrlist.size}")
}