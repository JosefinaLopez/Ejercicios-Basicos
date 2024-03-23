//Uso de clases selladas Unit
sealed class Unit{
    //La Clase Unit permite crear un numero limitado de sub clases como Soldier, Archer, Wizard
    class Soldier: Unit()
    class Archer: Unit()
    class Wizard: Unit()
}
//Funcion que maneja la respuesta de distintas instancias, segun la que se especifique
fun handleUnit(unit:Unit){
    when(unit){
        is Unit.Soldier -> println("Soldado Desplegado")
        is Unit.Archer -> println("Arquero Desplegado")
        is Unit.Wizard -> println("Mago Desplegado")

    }
}
fun main() {
    //Se instancia cada una de las clases
    val Unit1 = Unit.Soldier()
    val Unit2 = Unit.Archer()
    val Unit3 = Unit.Wizard()
    //Se llama a la funcion que maneja instancias e imprime
    handleUnit(Unit1)
    handleUnit(Unit2)
    handleUnit(Unit3)

}
