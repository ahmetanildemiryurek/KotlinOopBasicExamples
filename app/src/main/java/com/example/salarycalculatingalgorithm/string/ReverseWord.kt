package com.example.salarycalculatingalgorithm.string

import java.util.Scanner

fun main(){

    val input = Scanner(System.`in`)

    println("Kelimenizi Giriniz : ")

    val word = input.next()

    for (i in word.length - 1 downTo 0){
        print(word[i])
    }

}