
fun main(){
    /*
    In below section i have learn how i can
    get values from user and also further convert
    it accordingly.
     */


//    println("Enter your first name")
//    val name = readLine();
//    println("Hello, " + name)
//    println("Please pass an integer value")
//    val userInput = readLine()
//    val number = userInput?.toInt()
//    println("Number you have entered $number.")


    /*
    In this section user will enter two number and
    i will use if and else condition to check which
    number is greater and will pass greater number there
     */

    println("Enter first Number")
    val firstInteger = readLine()

    println("Enter second Number")
    val secondInteger =  readLine()
    if (firstInteger!! > secondInteger!!){
        println("first integer $firstInteger is greater")
    }else
        println("Second integer $secondInteger is greater")
    /*
    Write a program that takes an integer input from
    the user and prints whether the number is divisible
    by 3 and 5, divisible by 3 only, divisible by 5 only,
    or not divisible by either.
     */
    println("Enter an Integer value")
    val number = readLine()?.toInt() ?:0 // here it will read an get data to int and if there is nothing their than add zero value
    if ((number % 3 == 0) && (number % 5 == 0)){
        println("Number $number is divisible by 3 and 5")
    }else if (number % 3 == 0){
        println("Number $number is divisible by 3")
    }else if (number % 5 == 0 ){
        println("Number $number is divisible by 5")
    }else
        println("Number $number is neither divisible by 5 nor 3")

    /*
    Write a program which accept username from user and apply conditon
    if username text length is less than 6 or equal to 0 then ask it to
    provide appropriate username and then after that ask user to provide
    password to login
     */
}