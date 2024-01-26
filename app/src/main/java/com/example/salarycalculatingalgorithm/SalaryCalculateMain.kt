package com.example.salarycalculatingalgorithm
    /*
    * Parametrre olarak girrilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri geri döndüren bir metod yazılmalı
    * - 1 günde 8 saat çalışılabilir
    * - Çalışma saatlik ücret : 10 tl
    * - Mesai saat ücreti : 20 tl
    *
    * */
fun main(){
    fun sc() = SalaryCalculate()
    val result = sc().salaryCalculating(25)
    println("Salary : $result")
}
