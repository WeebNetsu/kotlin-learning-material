package za.soupcookie.kotlin

fun main(){
    val item: Any = 1002
    // a will cause an exception to occur, since we cannot use 1002 as a string
    // val a: String = item as String // UNSAFE way to convert a type
    val b: String? = item as? String // safe way of converting types, returns null if impossible
    // b will be null, since we can't use an integer as a string, but if 'item' was a
    // string, then b would not have been null
    println(b)

    // another way to do it safely
    val c: String = item as? String ?: "Hello!"
    println(c)

    val d: String = item.toString() // will convert an integer to a string
    println(d.length)
}