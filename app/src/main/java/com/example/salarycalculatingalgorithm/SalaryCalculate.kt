package com.example.salarycalculatingalgorithm
class SalaryCalculate {
    fun salaryCalculating(dayCount:Int):Int{
        val workingHours = dayCount * 8
            println("Working Hour : $workingHours")
        var salary = 0

        if (workingHours > 160){
            val overTime = workingHours - 160
            salary = 160 * 10 + overTime * 20
        }
        else{
            salary = workingHours * 10
        }
        return salary
    }

}