package com.example.salarycalculatingalgorithm.collections.ArrayList.oopArrayList


fun main(){
    val urun1 = Urun(1,"Tv",17500.0)
    val urun2 = Urun(2,"Phone",10500.0)
    val urun3 = Urun(3,"Tab",1500.0)

    val urunler = ArrayList<Urun>()
    urunler.add(urun1)
    urunler.add(urun2)
    urunler.add(urun3)

    for (urun in urunler){
        println("-------------")
        println("Urun No: ${urun.urunNo}")
        println("Urun No: ${urun.urunAd}")
        println("Urun No: ${urun.urunFiyat}")
    }

}