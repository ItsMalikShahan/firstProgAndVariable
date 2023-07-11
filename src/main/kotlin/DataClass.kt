
data class User(val id : Long, var name : String)

fun main(){

    var user1 = User(1, "shayan")
    println("user1 detail is $user1")
    var name = user1.name
    println(name)
    user1.name = "Kashif"
    println("user detail is $user1")
    val user2 = User(1, "Kashif")
    println(user1.equals(user2))
    val updatedUser = user1.copy(name = "Malik Shahan")
    println(user1)
    println(updatedUser)
    println(updatedUser.component1())
}