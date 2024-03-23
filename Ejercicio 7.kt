import kotlin.coroutines.* //Importa la clase y funciones (Aunque hay variables que no funcionan y hay que descargarlo de la pagina oficial)
//Funcion que carga noticias luego de 2 segundos
fun fetchNews(){
    println("Solicitando Noticias...")
    //GlobalScope es una funcion de coroutines y esto significa que sera lanzada luego de 2s
    GlobalScope.launch{
        delay(2000)
        println("Noticias Recibidas: Medico se agarra a golpes con paciente esquizofrenico")
    }
}
fun main() {
    //se llama a la clase y esta se muestra caada 3 s
    fetchNews()
    println("Mostrando otras secciones de la aplicacion mientras se cargan las noticias")
    Thread.sleep(3000)

}
