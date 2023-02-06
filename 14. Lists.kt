package za.soupcookie.kotlin

fun main() {
    // list is basically an array
    val friends: List<String> = listOf("Jack", "Nick", "Jane", "Billy")
    val randomList: List<Any> = listOf("Tall", 76, 2.5, true)
    // randomList[0] = "Max" // not allowed to change/add items inside a list

    for (friend in friends) { // loop through list
        println(friend)
    }

    for (item in randomList) {
        if (item is Int) { // check if an variable is of type int
            println("$item is an integer")
        } else if (item is String) {
            println("$item is an str")
        } else if (item is Double) {
            println("$item is an double")
        } else if (item is Boolean) {
            println("$item is an bool")
        }
    }

    for (item in randomList) {
        when(item){ // you can do it with a when (case) statement as well
            is Int -> println("$item is an integer")
            is String -> println("$item is an str")
            is Double -> println("$item is an double")
            is Boolean -> println("$item is an bool")
        }
    }

    // arraylist is basically an array that does not have a fixed size, unless specified
    // you can add items to the list and change the existing values
    // the reason we can change the content of a val (constant) in an array list is because
    // the references are constant, the values being referenced are not
    val arrList = ArrayList<String>()
    arrList.add("One") // add item to arraylist
    arrList.add("Two")
    arrList.add("Three")
    arrList.remove("Two") // remove item from arraylist
    arrList[0] = "Unu"

    val arrList3 = ArrayList<String>()
    arrList3.add("YAY!")
    arrList3.add("NAY!")

    arrList.addAll(arrList3) // add all items in arrList3 to arrList
    val itr = arrList.iterator() // create an iterator that can be used to loop through a list
    while(itr.hasNext()){
        println(itr.next())
    }
    println("arrList has ${arrList.size} items in it")
    println(arrList[0]) // get item at index 0

    // the below arraylist can only contain 5 items
    val arrList2 = ArrayList<Double>(5)
    arrList2.add(3.2) // add item to arraylist
    arrList2.add(1.9999)
    arrList2.add(4.423)
    arrList2.remove(1.9999) // remove item from arraylist
    for (i in arrList2){
        println(i)
    }

    // mutableListOf is basically the same as an ArrayList, the main difference is that with an
    // arraylist you're specifying you want an arraylist, with a mutableListOf, you're telling
    // kotlin that it can choose the best type of list for the job, so in a very rare scenario
    // where a kotlin update changes what a mutableListOf will return, a new type of list that
    // is not an ArrayList will be used. Rule of thumb is that unless you have a specific reason
    // to use the arraylist, you should use the mutableListOf
    // TL:DR: I don't know what list type I want! -> use mutableListOf, it's the same as ArrayList,
    // but better
    val mutList = mutableListOf<String>()
    mutList.add("Mike") // has all the same functions as arraylist
}