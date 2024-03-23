//Clase sellada que contiene subclases
sealed class SearchResult{
    //El data class success contiene una variable lista que especifica su valor string
    data class Success (val items: List<String>):SearchResult()
    data class Error (val message:String):SearchResult()
}
//Funcion que maneja el control de respuestas segun su seleccion
fun processSearchResult(result: SearchResult){
    when(result){
        is SearchResult.Success -> println("Resultados Encontrados: ${result.items}")
        is SearchResult.Error -> println("Error al Buscar: ${result.message}")
    }
}
fun main() {
    //Se instancia la sub clase de cada accion
    val successfulResult = SearchResult.Success(listOf("Resultado 1","Resultado 2","Resultado 3"))
    val errorResult = SearchResult.Error("No se pudo conectar al servidor")
    //Se imprime el resultado segun la seleccion
    processSearchResult(successfulResult)
    processSearchResult(errorResult)

}
