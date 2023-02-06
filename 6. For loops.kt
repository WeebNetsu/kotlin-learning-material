package za.soupcookie.kotlin

fun main(){
    // NOTE: For future tutorial: I did not customize this lesson! Create own lesson!
    for (num in 1..10){ // nice peaceful for loop
        println("There are $num people in this room")
    }

    for(i in 1 until 10){ // same as above, but goes until 9 and NOT 10
        println(i)
    }

    for(i in 10 downTo 1){ // counts down instead of up (including 1 and 10)
        println(i)
    }

    for(i in 10 downTo 1 step 2){ // counts down, but in steps
        println(i)
    }
}