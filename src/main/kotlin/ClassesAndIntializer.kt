
var a = 3
fun main (){
var shahan = Person("Malik", "Shahan")
    var rehman = Person("Abdul", "Rehman", 32)
    rehman.hobby = "playing match"

    rehman.stateHobby()
    var shayan = Person()
    myFunction(5)
       a = 7
    shahan.stateHobby()
}
class Person(firstName : String = "Shayan", lastName : String = "Naveed"){
    // Member function - properties
    var age : Int? = null
    var hobby : String = "Watching Movie, Netflix, Cricket"
    // Initializer block
    init {
        println("first Name $firstName and last Name is $lastName")

    }
    //member secondary constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }
    fun stateHobby(){
        println("My hobby is $hobby")
    }
}
fun myFunction(a: Int){
    var a = a
    println("a is $a")
}