import java.text.SimpleDateFormat
import java.util.*

//la funcion extiende la calse formatDate
fun Date.formatDate(): String {
    //se formatea la fecha recibida dada las necesidades
    val formatter = SimpleDateFormat("dd/MM/yy HH:mm:ss")
    //retorna la fecha formateada
    return formatter.format(this)
}

fun main() {
    //se instancia la fecha y hora actual
    val currentDay = Date()
    //Imp
    println("Fecha Formateada: ${currentDay.formatDate()}")
}
