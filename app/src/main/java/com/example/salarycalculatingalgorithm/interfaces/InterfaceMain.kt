package com.example.salarycalculatingalgorithm.interfaces

import Apple
import RedApple


fun main(){
    val redApple = RedApple()
    val apple: Apple = Apple()
    val chicken:Eatable = Chicken()

val nesneler = arrayOf(redApple,apple,chicken)

    for (nesne in nesneler){
        nesne.howToEat()

        if (nesne is Eatable)
            nesne.howToEat()

        if (nesne is Squeezable){
            nesne.howToSqueeze()
        }

    }

}