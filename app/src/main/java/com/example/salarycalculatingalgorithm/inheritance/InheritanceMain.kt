package com.example.salarycalculatingalgorithm.inheritance

fun main(){
    val araba = Araba("Sedan","Gri", "Manuel")
    println(araba.kasaTipi)
    println(araba.renk)
    println(araba.vites)

    println("---------------------------------------------------------")

    val honda = Honda("2023","Sedan","Mavi" , "Otomatik")
    println(honda.model)
    println(honda.kasaTipi)
    println(honda.renk)
    println(honda.vites)

}