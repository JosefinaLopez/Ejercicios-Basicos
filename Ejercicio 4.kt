data class Song(val title:String, val gener:String)

fun main() {
    //Se crea una lista para rellenar la clase
    val song = listOf(
        Song("Perfect - Ed Sheeran 1", "Pop"),
        Song("Bohemian Rhapsody - Queen", "Rock"),
        Song("Diamonds - Rihanna 3", "Pop"),
        Song("Bad Reputation - Avicii", "Electronica"),
        )
    //Filtrar Canciones por Genero
    //Se usa expresion lambda para buscar el genero
    val popSongs = song.filter{it.gener == "Pop"}
    //Hago que se muestren solo los titulos
    val titlePopSongs = popSongs.map { it.title }
    println("Canciones Pop: $titlePopSongs \n")
}
