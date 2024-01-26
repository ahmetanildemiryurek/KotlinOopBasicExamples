package com.example.salarycalculatingalgorithm.collections.ArrayList

fun main(){
 // veri ekleme,silme,get metodu (index) ile verileri getirme
    var meyveler = ArrayList<String>()
    meyveler.add("ELMA")
    meyveler.add("ARMUT")
    meyveler.add("MUZ")
    meyveler.add("ÇİLEK")
    meyveler.add("KARPUZ")

    println(meyveler[2])

    meyveler.removeAt(4)

    println(meyveler.toString())

    for (meyve in meyveler){
        println("Meyve : $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println("İndexi $indeks olan $meyve")
    }

}
