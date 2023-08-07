package com.serpilozguven.kotlinoopproject

open class Musician (name: String, instrument: String, age: Int){
    var name : String? = name
        private set
        get
    var instrument : String? = instrument
    var age : Int? = age
        get
        private set

    private val bandName : String = "Metallica"
    fun returnBandName(password: String) : String {
        if (password == "Serpil") {
            return bandName
        } else {
            return "Wrong password!"
        }
    }
}