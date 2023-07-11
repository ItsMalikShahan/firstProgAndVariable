

fun main(){

    var myMobile = MobilePhone("Kit-Kat", "Samsung", "J7 prime")
    myMobile.changeBattery(20)
}
class MobilePhone(osName : String, brand : String, model : String){
       var battery : Int = 50
    init {
        println("The phone $model from $brand uses $osName as its opearting system")
    }
    constructor(osName : String, brand : String, model : String, battery : Int)
    : this(osName, brand, model){
        this.battery = battery
    }
    fun changeBattery(chargeBattery : Int){
        println("Mobile battery was at $battery and now battery is changed to ${battery+chargeBattery}")
        battery += chargeBattery

    }
}
