package za.soupcookie.kotlin

// an interface basically says: Any class using me MUST have these variables
// and functions!
interface Phone{
    val batterySize: Int
    var batteryLevel: Double
    fun charge(speed: Int, timeCharging: Double){
        this.batteryLevel += timeCharging / speed
        println("Charged to ${this.batteryLevel}")
    }
    fun getDefaultLanguage(): String
}

// we're extending the Phone interface, so we need all the variables and functions
// we need to specify override, since we're overriding the defaults
// You can extend multiple interfaces, so Phone, Interface2 etc.
open class Smartphone(override val batterySize: Int, override var batteryLevel: Double, touchScreen: Boolean = true) : Phone{
    // since charge was already defined (has body), we don't have to override/implement
    // it here. Only if we want to change it

    // we have to override the function to modify it
    override fun getDefaultLanguage(): String {
        return "US English"
    }
}

// we don't have to include touchScreen here, since it has a default value in the parent class
open class Xiaomi(batterySize: Int, batteryLevel: Double) : Smartphone(batterySize, batteryLevel) {
    // this is an optional thing we can do, but we can still override the declared charge function
    override fun charge(speed: Int, timeCharging: Double) {
        super.charge(speed, timeCharging) // idk what this does
        this.batteryLevel += timeCharging
        println("Charged to ${this.batteryLevel}! Wow, Xiaomi so cool!")
    }

    // this is just like a normal class now, it can do all things a normal child class can
    override fun getDefaultLanguage(): String {
        return "UK English"
    }
}

fun main() {
    val smart = Smartphone(3000, 50.7, false)
    val xiaomi = Xiaomi(5000, 80.1)

    smart.charge(22, 50.5)
    xiaomi.charge(20, 100.0)
    println(smart.getDefaultLanguage())
    println(xiaomi.getDefaultLanguage())
}