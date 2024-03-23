//Declara una variable double la cual realiza la operacion segun el parametro en celsius
val celsiusToFahrenheit:(Double) -> Double = {celsius -> celsius * 9 /5 +32 }

fun main() {
    //Se da el valor
  val temperaturaCelsius = 20.0
    //se realiza la conversion de la variable
    val temperaturaFahrenheit = celsiusToFahrenheit(temperaturaCelsius)
    //imp
    println("Temperatura en Fahrenheit $temperaturaFahrenheit")
}
