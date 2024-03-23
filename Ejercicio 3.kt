class Bitmap {
    //Funcion para dimensioanr  imagen
    fun resize(width: Int, height: Int): Bitmap {
        //comprobacion
        println("Redimensionando bitmap a $width x $height")
        return Bitmap()
    }
}

fun main() {
    //instancia de imagen
    val image: Bitmap = Bitmap()
    //redimension de imagen segun los parametros establecidos
    val thumbnail = image.resize(100, 100)
}
