package za.soupcookie.kotlin

// an abstract class cannot be instantiated, you cannot use it as its own object.
// however, it's child classes can be used
// an abstract class is like an interface, but has constructors (init functions), you can only extend
// ONE abstract class (unlike with interfaces), and abstract classes can hold fields
// like with belows manufacturer, weight (while an interface cannot)
abstract class Desktop(private val manufacturer: String, private val weight: Double){
    abstract var speed: Int // abstract - has to be overridden by subclass/child class
    var status = "Good"

    abstract fun start() // has to be overridden later

    fun displayStatus(){
        println("This component by $manufacturer, weighing in at $weight kg, is in ${this.status} condition.")
    }
}

// we have to declare the abstract speed variable in the constructor as you can see below
class RAM(manufacturer: String, weight: Double, override var speed: Int, val size: Int) : Desktop(manufacturer, weight){
    var currentCapacity: Int = 0

    override fun start() {
        println("Starting ram...\n$size kb fully loaded. Transfer speeds: $speed mb/s")
        println("Loading OS Resources...")
        this.currentCapacity += 1024
        println("OS loading finished.")
    }

    fun openApplication(appName: String, appResourceUsage: Int){
        this.currentCapacity += appResourceUsage
        if (this.currentCapacity > size){
            println("All RAM was used up! Crashing!")
        }else{
            println("Opened $appName.")
        }
    }

    fun getUsage(): Int{
        return this.currentCapacity
    }
}

fun main(){
    // we don't create a Desktop class, since we CAN'T, it is ABSTRACT, so it cannot be instantiated
    val ram = RAM("Nexus", 14.2, 240, 4092)

    ram.displayStatus()
    ram.status = "Bad"
    ram.displayStatus()

    ram.start()
    ram.openApplication("Chrome", 2048)
    println("${ram.getUsage()}kb used of ${ram.size}kb")
}