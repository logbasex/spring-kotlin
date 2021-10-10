package com.example.api.practice

fun resizePane(newSize: Int = 10, forceResize: Boolean = false, noAnimation: Boolean = true) {
    println("The parameters are newSize = $newSize, forceResize = $forceResize, noAnimation = $noAnimation")
}

val s : String = "hello";

fun printCharOfWord(word: String) {
    for (w in word) {
        println(w)
    }
}

val n = 5
val message = "$n is ${if(n > 0) "positive" else "not positive"}"

fun main(args: Array<String>) {
   resizePane()
//   println(s)
//    printCharOfWord("HELLO")
//    print("Hello".padEnd(20, '!'))
//    println(message)
    val receipt = """Item 1: $1.00
                >Item 2: $0.50""".trimMargin(">")
    println(receipt)
}