fun main(){

    println("Digite sua primeira nota: ")
    var n1 = readLine()!!.toDouble()

    println("Digite sua segunda nota: ")
    var n2 = readLine()!!.toDouble()
    var divisao = (n1 + n2)/2
    var divisaoFormatado = String.format("%.2f", divisao).toString()

    print("A sua média é: \n${divisaoFormatado}")
}