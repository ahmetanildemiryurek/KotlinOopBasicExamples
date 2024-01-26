import com.example.salarycalculatingalgorithm.interfaces.Eatable
import com.example.salarycalculatingalgorithm.interfaces.Squeezable

open class Apple : Eatable,Squeezable{
    override fun howToEat() {
        println("Dilimleyerek ye")
    }

    override fun howToSqueeze() {
        println("Suyunu sık")
    }

}