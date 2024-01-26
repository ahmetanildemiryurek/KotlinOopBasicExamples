package com.example.salarycalculatingalgorithm.collections.ArrayList.oopArrayList

fun main ( ){

    val kisi1 = ArrayListKisiler(1,"Anıl","A")
    val kisi2 = ArrayListKisiler(2,"Ahmet","B")
    val kisi3= ArrayListKisiler(3,"Demir","C")

    val kisilerArrayList = ArrayList<ArrayListKisiler>()

    kisilerArrayList.add(kisi1)
    kisilerArrayList.add(kisi2)
    kisilerArrayList.add(kisi3)

    for (kisi in kisilerArrayList){
        println("***********************")
        println("Kişi : $kisilerArrayList")
        println("***********************")
    }

    println("Küçükten Büyüğe Doğru")
    val siralamaArrayList = kisilerArrayList.sortedWith(compareBy { it.kisiNo })

    println("İçinde A Harfi Olanlar :")
    val siralamaArrayList2 = kisilerArrayList.filter { (it.ad).contains("A")  }


    println(siralamaArrayList)
    println(siralamaArrayList2)


}