
fun main(){
    var x = 15
    while (x >=30){
        println("$x")
        x++
    }
    println("loop is ended")
    var tempFelt = "cold"
    var roomTemp = 10
    while (tempFelt == "cold"){
        roomTemp++
        if (roomTemp >= 20){
            tempFelt = "comfortable"
            println("now it's feel $tempFelt")
        }
    }
}