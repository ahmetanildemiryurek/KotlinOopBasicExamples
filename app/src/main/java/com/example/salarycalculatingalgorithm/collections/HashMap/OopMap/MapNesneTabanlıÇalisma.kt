package com.example.salarycalculatingalgorithm.collections.HashMap.OopMap

fun main(){

    val o1 = OgrenciMap(11,"Anil","A1")
    val o2 = OgrenciMap(12,"Anil2","A2")
    val o3 = OgrenciMap(13,"Anil3","A3")

    val ogrenciler = HashMap<Int,OgrenciMap>()

    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)

    for ((ogrenciNo,nesne) in ogrenciler){
    println("*******************")
    println("Öğrenci no : $ogrenciNo")
    println("Öğrenci ad : ${nesne.ad}")
    println("Öğrenci Sınıf : ${nesne.sinif}")
    }

}