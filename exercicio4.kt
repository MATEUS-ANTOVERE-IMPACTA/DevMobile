fun main(){

    println("Digite um número: ")
    var n1 = readLine()!!.toDouble()

    println("Digite outro número: ")
    var n2 = readLine()!!.toDouble()
    var soma = n1 + n2
    var somaformatado = String.format("%.2f", soma).toString()

    print("Soma dos números: \n${somaformatado}")
}