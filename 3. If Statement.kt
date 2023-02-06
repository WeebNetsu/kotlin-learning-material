package za.soupcookie.kotlin

fun main(){
    val x = 10
    val y = 5

    // if statements follows the rules like with any other language'
    // == != > < <= >=
    if(x > y){
        println("x is bigger than y")
    }else if(x == y){
        println("x is the same as y")
    }else{
        println("x is smaller than y")
    }

    if(x is Int){ // check if x is of type int
        println("X is an integer")
    }

    if(x !is Int){
        println("X is NOT of type integer")
    }
}