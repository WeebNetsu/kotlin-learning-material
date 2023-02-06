package za.soupcookie.kotlin

import java.lang.ArithmeticException

fun main(){
    var str: String? = "Hello"
    val all: Any = 222

    try { // for error handling
        // str = all as String // will throw ClassCastException

        str = null
        // you can also throw your own error
        if(str == null){
            // the below throws a math error exception, I do not know
                // any other types of exceptions, so I just pulled this one out of my hat
            throw ArithmeticException("Lol, str is null")
        }
    }catch (err: ClassCastException){ // this will catch the error
        println("Oof, error while trying to cast!")
        println(err)
    }catch (err: ArithmeticException){
        println("The error has happened")
        println(err) // custom message will be shown
    }finally {
        println("This will run, if an exception occurred or not!")
    }
}