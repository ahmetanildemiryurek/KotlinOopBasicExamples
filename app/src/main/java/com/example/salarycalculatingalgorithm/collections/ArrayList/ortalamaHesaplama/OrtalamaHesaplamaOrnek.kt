package com.example.salarycalculatingalgorithm.collections.ArrayList.ortalamaHesaplama

fun main(){
    val sayilar = ArrayList<Int>()

    sayilar.add(12)
    sayilar.add(15)
    sayilar.add(13)
    sayilar.add(17)
    sayilar.add(46)
    sayilar.add(11)

    var toplam = 0

    for (sayi in sayilar){
        toplam = toplam+sayi
    }
        println("Ortalama : ${toplam/sayilar.size}")
}