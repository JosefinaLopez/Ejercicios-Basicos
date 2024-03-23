fun main() {
    //Titulo de la tarea donde ha obtenido un origen de datos
    // representa que si la variable tasktitle no tiene contenido, que sea null
    val TaskTitle:String? = null
    //Mostrar el titulo de la tarea
    //el operador elvis valida que si la variable es null  , su valor por defecto sea "No disponible
    val displayTitle = TaskTitle ?: "Titulo No Disponible"
    println("El titulo de la tarea es: $displayTitle")

}
