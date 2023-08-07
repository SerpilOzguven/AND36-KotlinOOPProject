package com.serpilozguven.kotlinoopproject

class Dog : Animal() {
    fun test() {
        super.sing()

    }

    override fun sing() {
        println("dog class")

    }
}