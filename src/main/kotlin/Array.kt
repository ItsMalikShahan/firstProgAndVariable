
fun main(){
    //val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
   // val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println("initial value in array are ${numbers.contentToString()}")
//    for (number in numbers){
//        print("${number+2} ")
//    }
    numbers[0] = 2
    numbers[1] = 4
    numbers[2] = 3
    numbers[3] = 5
    numbers[4] = 6
    numbers[5] = 8
    numbers[6] = 10
   // numbers[7] = 12
    println(numbers[6])
    println("final values of the changed array are ${numbers.contentToString()}")
    val day = arrayOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    println(day.contentToString())
    val fruit = arrayOf(Fruit("apple", 50.0), Fruit("banana", 20.0), Fruit("Appricot", 32.9))
    println(fruit.contentToString())
    for (fruitName in fruit.indices){
        println(" ${fruit[fruitName].name} ")
    }
    for(index in fruit.indices){
        print("${fruit[index].name} is in index $index ")
    }

}
data class Fruit(val name: String, val price: Double){

}