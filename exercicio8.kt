fun main(){

    println("Digite um número: ")
    var n1 = readLine()!!.toDouble()

    var dobro = n1 * 2
    var dobrook = String.format("%.2f", dobro).toString()
    var terça = n1 / 3
    var terçaok = String.format("%.2f", terça).toString()

    println("Dobro do número: $dobrook \n Terça parte do múmero: $terçaok")
}