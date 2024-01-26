package com.example.salarycalculatingalgorithm.thread


//Threadi Thread ile dahil etme

class BirinciThread : Thread() {

    override fun run() {
        for (i in 100..999){
            println("Birinci Thread : $i")
            Thread.sleep(100)
        }
            }
}