package com.example.salarycalculatingalgorithm.collections.HashSet

fun main (){
    val meyveler = setOf<String>("Elma","Armut","Çilek")

    val iller = setOf<String>("Adana","İzmir","Antalya")

    val sayilar = HashSet<Int>()

    sayilar.add(1907)
    sayilar.add(1908)
    sayilar.add(1909)

    println(sayilar.toString())
    sayilar.remove(1909)

    println(sayilar.toString())
    println(sayilar.elementAt(1))
    println(sayilar.size)
    println(sayilar.count())
    println(sayilar.isEmpty())
    println(sayilar.contains(1907))

    for ((i,s) in sayilar.withIndex()){
        println("$i.--> olan sayi : $s")
    }

    println(sayilar.toString())


}