package com.example.salarycalculatingalgorithm

class InternetPrice {
    /*
    * Parametre olarak girilen kota miktarrına göre ücreti hesaplayarak geri döndüren metot
    *  - 50GB 100TL
    * - Kota aşımı sonrası her 1GB 4TL
    * */
    fun internetPrice(quota : Int):Int{

        var price = 0
        if(quota > 50){
            val overageQuota = quota - 50
            price = overageQuota * 4 + 100

        }
        else{
            price = 100
        }
        return price
    }
}