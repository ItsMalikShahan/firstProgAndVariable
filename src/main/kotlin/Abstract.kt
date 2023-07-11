
/*
 this is abstract class and we can can't create object
 We can inherit data from abstract class
 */
abstract class Mammal(private val name: String, private val origin : String,
    private val weight : Double){

    abstract val maxSpeed : Double

    abstract fun run()
    abstract fun breath()

    fun displayDetail(){
        println("Name $name from $origin have $weight and max speed is $maxSpeed")
    }

}

class Human(name: String, origin: String, weight: Double, override val maxSpeed: Double): Mammal(name, origin, weight) {
    override fun run() {
        println("A human run on two legs")
    }

    override fun breath() {
        println("A person take breath from nose and mouth")
    }
}
class Elephant(override val maxSpeed: Double, name: String, origin: String, weight: Double) : Mammal(name, origin,
    weight) {
    override fun run() {
        println("$name run with her four foot")
    }

    override fun breath() {
        println("$name take breath from the trunk")
    }
}
fun main(){
    var shahan = Human("Shahan", "Pakistan", 68.5, 10.0)
    var jenny =  Elephant(12.0, "Jenny","South Africa", 3000.00 )
    shahan.breath()
    jenny.breath()
    jenny.run()
    shahan.run()
}