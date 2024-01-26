package com.example.salarycalculatingalgorithm.collections.HashSet.oopSet

fun main(){
    val ogrenci1 = Ogrenci(44,"Anıl", "11-A")
    val ogrenci2 = Ogrenci(45,"Anıl2", "11-B")
    val ogrenci3 = Ogrenci(46,"Anıl3", "11-C")
    val ogrenci4 = Ogrenci(46,"Anıl4", "12-C")

    val ogrenciler = HashSet<Ogrenci>()

    ogrenciler.add(ogrenci1)
    ogrenciler.add(ogrenci2)
    ogrenciler.add(ogrenci3)
    ogrenciler.add(ogrenci4)

    for (o in ogrenciler){
        println("**********")
        println("Öğrenci NO : ${o.no}")
        println("Öğrenci AD : ${o.ad}")
        println("Öğrenci SINIF : ${o.sinif}")
    }
}