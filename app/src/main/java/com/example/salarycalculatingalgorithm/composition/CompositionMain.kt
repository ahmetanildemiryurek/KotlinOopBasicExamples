package com.example.salarycalculatingalgorithm.composition

    fun main(){
        val adres = Adres(il = "Malatya", ilce = "Yeşilyurt")
        val kisi = Kisiler(ad = "ANIL" , soyad = "DEMİRYÜREK", adres)

        println("--------------------------")
        println("Kisi Ad : ${kisi.ad}")
        println("Kisi Soyad : ${kisi.soyad}")
        println("Kisi İl : ${kisi.adres.il}")
        println("Kisi İl : ${kisi.adres.ilce}")
        println("--------------------------")

    }

