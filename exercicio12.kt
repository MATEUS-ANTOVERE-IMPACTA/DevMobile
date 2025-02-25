import kotlin.math.pow

fun main (){
    println("Valor de A?")
    var a = readLine()!!.toDouble()

    println("Valor de B?")
    var b = readLine()!!.toDouble()

    println("Valor de A?")
    var c = readLine()!!.toDouble()

    var expoente = 2

    var delta = b.pow(expoente)-4*a*c

    println("O valor do delta é $delta")
}