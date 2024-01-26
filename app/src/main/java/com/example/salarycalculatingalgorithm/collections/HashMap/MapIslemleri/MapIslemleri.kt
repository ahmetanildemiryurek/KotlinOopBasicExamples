package com.example.salarycalculatingalgorithm.collections.HashMap.MapIslemleri

fun main(){

    val sayilar = mapOf(1 to "Bir", 2 to "İki")

    val oranlar = mutableMapOf(1.5 to "Oran1" , 2.5 to "Oran2")

    val iller = HashMap<Int,String>()

    iller.put(1,"ADANA")
    iller.put(2,"ADIYAMAN")
    iller.put(44,"MALATYA")

    println(iller.toString())

    iller.put(1,"YENİ ADANA")
    println(iller.toString())

    println(iller.get(44))
    //.......




}