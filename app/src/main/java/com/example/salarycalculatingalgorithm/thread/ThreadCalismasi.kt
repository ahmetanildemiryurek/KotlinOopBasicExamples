package com.example.salarycalculatingalgorithm.thread
fun main () {

    //Thread sınıfında alınırsa böyle tanımlanır.
    val birinciThread = BirinciThread()
    birinciThread.start()

    //Runnable interface kullanılırsa bu şekilde tanımlanır.
    val ikinciThread = Thread(İkinciThread())
    ikinciThread.start()

    for (i in 900..999){
        println("Main Thread : $i")
        Thread.sleep(100)
    }
}