
fun main(){

    var myCar = Car()
    myCar.owner
   println("Owner of the car is  ${myCar.owner}")
    println("Brand  of my car is  ${myCar.myBrand}")


}
open class Car(){
    lateinit var owner : String
    val myBrand : String = "BMW"
        get() {
            return field.toLowerCase()
        }
    init {
        owner = "Shayan"
    }
}