//se crea una clase sellada llamada accion
sealed class Action{
    object MaskCompleted: Action()
    object Delete:Action()
    object Edit: Action()
}
//Funcion que maneja los objects segun su seleccion
fun perfomAction(action: Action)
{
    when(action){
        is Action.MaskCompleted -> println("Tarea Marcada Como Completada")
        is Action.Edit -> println("Tarea Editada")
        is Action.Delete -> println("Tarea Eliminada")

    }
}
fun main() {
    //Se instancia la sub clase de cada accion
    val action1 = Action.MaskCompleted
    val action2 = Action.Edit
    val action3 = Action.Delete
    //Se imprime el resultado segun la seleccion
    perfomAction(action1)
    perfomAction(action2)
    perfomAction(action3)

}
