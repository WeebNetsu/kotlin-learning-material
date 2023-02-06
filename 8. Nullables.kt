package za.soupcookie.kotlin

fun main(){
    var word: String = "Hello"
    // the below is not possible
    // word = null

    var word2: String? = "Hi!"
    word2 = null // allowed because word2 had a '?' after the type, to specify that it can be null

    println(word.length) // return the word length
    // below will only return the length if the variable is NOT null
    // so instead of having to check if it's null with an 'if statement', you
    // can use an '?', almost like you can in JavaScript
    println(word2?.length)

    // the below is the same as: if (word2 != null) { ... }
    word2?.let {
        println("Word 2 is not null")
    }

    // the below is saying, word3 = word2 IF word2 is NOT null. ELSE become I am power
    // ?: (elvis operator) is the equivalent of the || operator in other languages
    // although, || is reserved for IF statements and ?: for the below
    val word3 = word2 ?: "I am power"
    println(word3)

    // !! -> like in Typescript, this tells Kotlin that you are 100% sure that this
    // variable is NOT null. (Will throw an error if null)
    println(word3!!.length)
    // in tutorial, use word2 as example instead of word3
}