fun main(){
    println("Valor atual que tem em sua conta bancaria: ")
    var n1 = readLine()!!.toDouble()

    var transforma = n1 / 3.45
    var transformaok = String.format("%.2f", transforma).toString()

    print("O valor que tem em dólares na sua conta bancaria é: $transformaok")

}