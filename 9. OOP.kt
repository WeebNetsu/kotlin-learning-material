package za.soupcookie.kotlin

fun main() {
    var jack = Person("Jack", "Pamoemba")
    var john = Person("John")
    // john.health = 5 // not allowed, since health has a private setter
    println(john.health)
    john.age = 20 // you don't have to create a getAge or setAge, kotlin does it behind the scenes
    println(john.age)

    var nick = Person("Nick", "Peere", 23) // there are 2 different constructors
    println(nick.age)
    nick.isWho()
}

// class Person constructor(firstName: String, lastName: String)
// the above is the exact same as the below
class Person(firstName: String, lastName: String = "Macros") { // create a basic class
    // firstName and lastName automatically have this.firstName = firstName, so no need
    // to implement it
    // lastName has a default value
    var age: Int? = null // can create member variables
        // creating getters and setters are optional in kotlin, unless you want to
        // modify what happens when getting or setting a value
        get(){ // this is a getter in kotlin
            // now whenever we get the age, the below will print out
            println("Getter for age was called!")
            // field = this.age
            return field ?: 0
        }
        set(value){ // this is a setter in kotlin
            // field = this.age
            // value is the value passed
            field = value
        }

    var health: Int = 100
        private set // makes the setter private, so only THIS class can use it
    var firstName: String? = null
    var lastName: String? = null

    // you can create a 2nd constructor, to make the age variable an optional input
    // this(firstName, lastName) = the original constructor still gets called, the below
    // will basically use that constructors data and pass it in here
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName){
        this.age = age // specify what constructor should do
        println("This constructor will get called as well! They are $age years old!")
    }

    init { // basically the constructor, gets ran as soon as object is created
        this.firstName = firstName
        this.lastName = lastName
        this.health -= 50 // can only be set from inside the class, since the setter is private

        // we don't have to specify this here, since whatever is passed into the constructor
        // is available in the init, as is
        println("This is the init function for $firstName $lastName")
    }

    fun isWho(){
        // we use ${} since if we used $ only 'this' would've been registered
        println("${this.firstName} with the last name of ${this.lastName} is ${this.age} years old")
    }
}