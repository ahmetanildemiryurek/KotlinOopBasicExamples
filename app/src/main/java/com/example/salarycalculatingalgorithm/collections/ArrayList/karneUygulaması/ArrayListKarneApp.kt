import com.example.salarycalculatingalgorithm.collections.ArrayList.karneUygulaması.DersNotlar
import java.util.Scanner

fun main (){
    val input = Scanner(System.`in`)

    val dersNotlariListesi = ArrayList<DersNotlar>()

    while (true){
            println("Dersin adını giriniz:")
            val ders = input.next()

            println("Notunuzu giriniz:")
            val not = input.nextInt()


             val yeniNot = DersNotlar(ders, not)
            dersNotlariListesi.add(yeniNot)

        println("Çıkmak için (1) - Devam etmek için farklı bir sayı giriniz")
        val output = input.nextInt()

        if (output == 1){
            println("Çıkış Yapıldı !")
        break
        }

        println("*************************************")

        for (dn in dersNotlariListesi){
            println("${dn.ders} : ${dn.not}")
        }

    }


}