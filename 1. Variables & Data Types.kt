package za.soupcookie.kotlin

fun main(){ // main function, just like in C++ and Java
    print("Hello World\n") // basic hello world program!

    val myVar = "Hello!" // CONSTANT
    var a = "World" // normal variable
    a = "World!\n" // normal variables can be reassigned
    print("$myVar $a") // $ can be used to create a fstring

    var b: Int = 10_000 // you can specify a variable type (int = 32bit)
    var c: String = "Word"
    print(c[0] + "\n") // will return the first letter in the string (starts at 0)
    print(c.length) // returns the string length
    var d: Boolean = false
    var e: Char = 't' // char uses '' and string uses ""
    var f: Float = 3.14159F // floats need an F to convert from double to float
    var g: Double = 3.141592323

    /*
    There are of course more data types such as
    Byte (8bit)
    Short (16bit)
    Long (64bit)
    */
}