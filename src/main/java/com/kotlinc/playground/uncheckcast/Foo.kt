package com.kotlinc.playground.uncheckcast;

interface Foo { /*...*/ }

class FooImpl : Foo { /*...*/ }

fun Foo(): Foo {
    return FooImpl()
}

