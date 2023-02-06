package za.soupcookie.kotlin

// classes are final by default, so it has to be open if you want to use inheritance
open class Animal(val name: String, val captiveBread: Boolean){
    var hasLegs: Boolean = true
    open var runningSpeed: Double = 1.0 // make it open if you want to be able to override it later

    fun updateRunningSpeed(age: Int){
        if (hasLegs){
            runningSpeed *= age / 1.5
        }
    }

    open fun eat(){ // if a function is open, it can be manipulated later in other classes
        println("Nom nom nom!")
    }
}

// you can inherit with the: child : parent()
// since the Animal class requires a name and captiveBread, Reptile also requires it
// reptile class can however extend the parameters that Animal has (rareLevel)
open class Reptile(name: String, captiveBread: Boolean, rareLevel: Int = 1) : Animal(name, captiveBread) {
    override var runningSpeed: Double = rareLevel * 1.2 // we can override this variable, change it's default value
    var color: String = "Green" // you can still add your own properties and methods to these classes
}

// a sealed class cannot be inherited from
// so: sealed class Snake(...) -> can not be inherited and is basically locked
class Snake(name: String, captiveBread: Boolean, rareLevel: Int) : Reptile(name, captiveBread, rareLevel){
    init {
        this.hasLegs = false // we can access variables declared in a parent class
    }
}

// a class does not need anything in front of it when inheriting
// since rareLevel has a default value, we don't have to include it
class Lizard(name: String, captiveBread: Boolean) : Reptile(name, captiveBread){
    override fun eat(){ // we can use override to change the functionality of this OPEN method
        println("Lizard eats! Nom nom nom!")
    }
}

fun main() {
    var animal = Animal("Jack", true)
    var reptile = Reptile("Marlin", false, 10)
    var snake = Snake("Pip", true, 4)
    var lizard = Lizard("Slew", false)

    // since the classes inherit from one another, they all have the eat method
    animal.eat()
    reptile.eat()
    snake.eat()
    lizard.eat()

    println(lizard.hasLegs)
    println(snake.hasLegs)

    println(reptile.color) // we can access the newly added variable
    snake.color = "Orange"
    println(snake.color)
}

/* Abstract classes (not original, modify for tutorial)
import kotlin.math.PI // to use PI in kotlin

fun main() {
	val cabin = SquareCabin(5, 50.0);
    println("Capacity: ${cabin.capacity}")
    println("Material: ${cabin.buildingMaterial}")
    println("Has room: ${cabin.hasRoom()}")
    println("Has room: ${cabin.floorArea()}")

    cabin.getRoom()
    println("Has room: ${cabin.hasRoom()}")
    cabin.getRoom()

    val hut = RoundHut(3, 10.0)
    println("Floor area: ${hut.floorArea()}")
    val tower = RoundTower(4, 15.5, 3)
    println("Floor area: ${tower.floorArea()}")
}

// an abstract class is a class that cannot be instansiated
// so val x = Dwelling() is not allowed
abstract class Dwelling(private var residents: Int){
    abstract val buildingMaterial: String // wood, brick etc.
    abstract val capacity: Int // how many people can it hold'

    // defined here, but has to be implemented by an inheriting class
    abstract fun floorArea(): Double

    fun hasRoom(): Boolean {
        return residents < capacity
    }

    fun getRoom() {
        if(hasRoom()){
            residents++
            println("You got a room")
        }else{
            println("Sorry, this dwelling is full")
        }
    }
}

// squarecabin is inheriting from dwelling
class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
    // when you override something, you say that you want to
    // change the value given by the parent, since it was
    // abstract in the parent (we basically promised that
    // we will add a value to it later), we need to give it
    // a value, if we just said "val capacity", then kotlin
    // won't know if we're talking about the existing value
    // in the parent or a new value, so we use override
    // to say "change the existing one in the parent"
    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double {
        return length * length
    }
}

// in kotlin all classes are 'final' by default, meaning that
// you are not allowed to inherit from them. You can only inherit
// from abstract or open classes
open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double {
        // PI could also be written as
        // kotlin.math.PI if you don't import it
        return PI * radius * radius
    }
}

// this class would be a final
class RoundTower(residents: Int,
                 radius: Double,
                 val floors: Int = 3) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        // by using super, you can use the function/variable
        // of a class you're inheriting from
        return super.floorArea() * floors
    }
}
*/