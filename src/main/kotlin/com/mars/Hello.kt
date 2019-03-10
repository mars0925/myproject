package com.mars

fun main(args: Array<String>) {
    val d = Dog()
    d.weigh()
    print(d.bark())

    val c = Dog()
    c.bark()
}

class Human{
    fun hello(){
        print("Hello CCCCC")
    }

}

class Dog{
    fun bark(){
        println("旺旺")
    }
    fun weigh(): Int {

        return 25
    }

}