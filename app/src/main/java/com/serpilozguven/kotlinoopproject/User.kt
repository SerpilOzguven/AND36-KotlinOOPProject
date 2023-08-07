package com.serpilozguven.kotlinoopproject

class User : People {
    //property
    var name : String? = null
    var age : Int? = null

    constructor(nameInput:String,ageInput:Int) {
        this.name = nameInput
        this.age = ageInput

        println("User created")
    }
   init {
       println("")
   }

}