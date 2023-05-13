
fun main (){
    /*
    In this program we will learn how we can use different
    data types in our kotlin project and will write a program to
    through which we can get student data
     */
    var firstName = "Shahan"   // String
    var lastName = "Naveed"    // String
    val rollNo = 52            // Int
    val grade = 'B'            // Char
    val amount = 2300.00       // Double
    val isDaySchalor = true

    println("Hello my name is " +firstName)
    println("My registration number is " +rollNo)
    println("My grade in last semester is " + grade)
    println("Amount i have in my wallet is " + amount)
    println("Are you daySchalor " + isDaySchalor)
    /*
    Here am going to start a new session to learn how we
    can use operand in kotlin
     */
    val  x = 6
    val y = 12.0
    // here am doing casting
    val z = y.toInt();
    val sum = x + z
    println("sum of values " +x+ " and " +y+ " is " +sum)

    /*
    String section is start here
    and try to learn how string are used in kotlin
     */
    val greeting: String = "Hello, world"
    println(greeting)
    val charCount = greeting.length;
    println(charCount)
    println(greeting[0])
    println(greeting.get(3))
    println(greeting.substring(0, 6))
    println(greeting.last())

}