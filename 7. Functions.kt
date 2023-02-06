package za.soupcookie.kotlin

fun main(){
    sayHello("Jack", 10)
    val a = sum(20, 5)
    println(a)
    println(mul(8, 4))
    println(div(8, 4))
}

// The below is a function. with parameters you have to specify the type
// you can also give parameters default values (like with age)
// by default a function that returns nothing returns Unit, it is optional
// to say Unit, you could leave that empty and it will default it to Unit
fun sayHello(name: String, age: Int = 15): Unit {
    println("Hello $name! You are $age years old!")
}

// the below function returns an int
fun sum(x: Int, y: Int): Int {
    return x + y;
}

// below is a lambda function
val mul: (Int, Int) -> Int = { a:Int, b: Int -> a * b }
val div = { a: Int, b: Int -> a / b } // shorter version of a lambda function