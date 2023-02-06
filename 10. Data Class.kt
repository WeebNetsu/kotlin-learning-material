package za.soupcookie.kotlin

// in a data class you have to at least add 1 parameter
data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "Jack")
    println(user1.name)
    user1.name = "Mitch" // you can change this attribute because it was set with var
    println(user1.name)
    // user1.id = 22 // not possible since id was set with val

    val user2 = User(1, "Mitch")
    println(user1 == user2) // you can compare 2 data classes

    // the below will copy all data from user1, except for name, it will add it's own name
    val updatedUser = user1.copy(name="Kyle")
    println(user1)
    println(updatedUser)

    // you can also access attributes via using components
    println("ID: ${user1.component1()}\nName: ${user1.component2()}")

    val (id, name) = user1 // get data and store into 2 variables
    println("ID: $id\nName: $name")
}