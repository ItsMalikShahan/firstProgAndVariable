fun main() {
    /*
    When statement in kotlin is same like we use switch
    statements in java
     */
    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Invalid Day"
    }
    println(result)
    /*
    Write a program that takes a user input and uses a
    when statement to determine whether it is a
    positive, negative, or zero value.
     */
    println("Please write an integer value")
    val number = readLine()?.toIntOrNull() ?: return
    when {
        number > 0 -> println("Number is positive")
        number < 0 -> println("Number is negative")
        else -> println("Number is zero")
    }
    /*
    Create a function that takes an integer as an argument
    and uses a when statement to determine whether it is
    even or odd.
     */
    println("please write an integer value to know whether it is even or odd")
    val numberToCheck = readLine()?.toInt() ?: 0
    when{
        numberToCheck % 2 == 0 -> println("Number is even")
        numberToCheck % 2 != 0 -> println("Number is odd")
    }
}