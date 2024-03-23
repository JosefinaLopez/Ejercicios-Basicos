import java.io.OutputStream
import java.io.PrintWriter
import java.net.Socket

class ChatManager {
    //Se definen las variables
    private lateinit var socket: Socket
    //Para Escribir en el socket
    private lateinit var printWriter: PrintWriter

    fun connect() {
        // Se instancia la clase del socket para inicializarla
        socket = Socket("localhost",7000)
        //Se instancia la clase  para enviar datos de cliente-servidor
        val outputStream: OutputStream = socket.getOutputStream()
        //Evita que los datos se almacenen en el bufer
        printWriter = PrintWriter(outputStream, true)
    }

    fun sendMessage(message: String) {
        // Verificar si el socket fue inicializado
        if (::socket.isInitialized) {
            //Escribe el mensaje
            printWriter.println(message)
        } else {
            println("Error: Socket no inicializado")
        }
    }
    //Funcion que cierra toda clase y proceso
    fun disconnect() {
        if (::socket.isInitialized) {
            printWriter.close()
            socket.close()
        }
    }
}

fun main() {
    //se instancia la clase 
    val chatManager = ChatManager()
    //se conecta el socket
    chatManager.connect()
    //se envia el mensaje 
    chatManager.sendMessage("Hola, ¿Cómo estás? :)")
    //se desconecta
    chatManager.disconnect()
}
