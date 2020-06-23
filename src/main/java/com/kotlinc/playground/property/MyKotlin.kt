package com.kotlinc.playground.property

data class Person constructor(
    val name: String,
    var age: Int = 10,
    var city: String = ""
)

class MyKotlin {

    fun findYoungest(
        list: List<Person>
    ) {
        return list
            .minBy { it.age }
            .run { println(this) }
    }

    fun main(args: Array<String>) {

        val adam = Person("Adam").let {
            it.age = 32
            it.city = "London"
        }
        println(adam)


        val members = listOf("Joe", "Mary", "John")
        with(members) {
            println("The first = ${first()}")
            println("The last = ${last()}")
        }



        val myJava = MyJava()

        myJava.lastName = "Kumar"
        myJava.firstName = "Arjun"

        println("accessing value using property: "+myJava.firstName)
        println("accessing value using property: "+myJava.lastName)

        println("accessing value using method: "+myJava.getFirstName())
        println("accessing value using method: "+myJava.getLastName())
    }
}