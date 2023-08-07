package com.serpilozguven.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //constructor
        var myUser = User("James", 50)
        myUser.name = "Lars"
        myUser.age = 60

        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())

        //encapsulation
        var james = Musician("James", "Guitar", 55)
        println(james.age.toString())
        println(james.returnBandName("Serpil"))
        println(james.returnBandName("Sevgi"))

        //inheritance
        var lars = SuperMusician("Lars", "batery", 65)
        println(lars.name)
        println(lars.returnBandName("Serpil"))
        lars.sing()
        //james.sign()//çağıramıyoruz.


        //polymorphism

        //static polymorphism

        var matematics = Matematics()
        println(matematics.sum())
        println(matematics.sum(3, 4, 5))
        println(matematics.sum(3, 4))

        //dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        // abstract & interface

        //var myPeople = People() people abstract class olduğu için obje oluştuamayiz.
        //inheritance 'i tek bir sınıf için yapabiliyoruz.
        //Interfaceleri kullanarak %100 abstract yapılar  oluşturarak, birden fazla kalıtım alabiliriz.(implementation)

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()


    //Lambda expressions

        fun printString(myString: String) {
            println(myString)
        }
    printString("My Test String ")

    val testString = { myString: String -> println(myString)}
    testString("My Lamda String")

    val multiplyLambda = {a: Int, b: Int -> a * b }
    println(multiplyLambda(5,4))

    val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}
    println(multiplyLambda2(5,5))


        //asynchrnous

        //callback function, listener function, completion function

        fun downloadMusicians(url: String, completion : (Musician) -> Unit) {
            //url -> download
            //data
            val kirkHammet = Musician("Kirk","Guitar",60)
            completion(kirkHammet)
        }

        downloadMusicians("metallica.com",{ musician ->
            println(musician.name)
        })
    }


}

