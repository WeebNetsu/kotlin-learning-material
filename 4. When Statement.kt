package za.soupcookie.kotlin

fun main(){
    // when is like the case statement in other languages
    val day = 1
    when(day){
        1 -> println("it's day 1!")
        in 2 .. 5 -> println("its between day 2 and 5!")
        6, 7 -> {
            println("Can contain")
            println("Multiple lines of code!")
        }
        in 10 downTo 8 -> println("Same as normal in, but now goes down-to instead of up-to")
        !in 11..15 -> println("Only if it is NOT between 11 and 15")
        else -> "Invalid day of week!"
    }

    val x: Any = 15.9F // any is basically the default in kotlin when type is not specified
    when(x){
        is Int -> println("x is an int")
        is Float -> println("x is a float")
        !is String -> println("x is NOT a string")
    }
}