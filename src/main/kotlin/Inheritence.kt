

interface Drivable{
    val maxSpeed : Double
    fun drive() : String
    fun brake(){
        println("The drivable is braking")

    }}

open class Caar(val name: String, val brand: String, override val maxSpeed: Double) : Drivable {

    open var range: Double = 0.0
    open fun drive(distance: Double) {
        println("Car is droven $distance KM")
    }

    fun extendRange(amount: Double) {
        if (amount > 0)
            range += amount

    }

    override fun drive(): String {
        return "driving the interface drive"
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) : Caar(name, brand, maxSpeed) {

    override var range = batteryLife * 4
    override fun drive(distance: Double) {
        println("car droven $distance with electricity")
    }
    override fun drive(): String {
        return "Drive on Electricity for $range KM"
    }
}

fun main() {

    var hondaCar = Caar("21", "Honda",220.0)
    var tesla = ElectricCar("S-Model", "Tesla", 200.0, 250.0)
    hondaCar.drive(300.0)
    tesla.drive(200.0)
    tesla.drive()
}