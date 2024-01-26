package com.example.salarycalculatingalgorithm.thread


//Threadi Runnable ile dahil etme
class İkinciThread :Runnable {
    override fun run() {
        for (i in 200..299){
            println("İkinci Thread : $i")
            Thread.sleep(100)
        }
    }
}