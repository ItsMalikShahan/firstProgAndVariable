import java.lang.Math.floor

fun main(){
    val stringList : List<String> = listOf("kashif", "abdulRehman", "humza","wahaj", "Irfan", "Shahan")
    val mixedList : List<Any> = listOf("Shahan", 26, 'B', 3200.5, "Weight", "Kg")

    for(value in mixedList){
        when (value) {
            is Int -> {
                println("Integer are $value")
            }

            is Double -> {
                println("Double are ${floor(value)}")
            }

            is Char -> {
                println("Char are $value")
            }

            is String -> {
                println("String used are having length ${value.length}")
            }

            else -> {
                println("Something Else is type")
            }
        }
    }
    //smart casting
    val obj1: Any = "I have a dream to be a lover of you"
    if (obj1 !is String){
        println("Not a String")
    }else {
        println("found a String with length ${obj1.length}")
    }
    val obj2 : Any = 14154
    val st1 : String? = obj2 as? String
    print(st1)
}