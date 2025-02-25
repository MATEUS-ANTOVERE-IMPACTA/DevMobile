fun main(){
    println("Qual o valor total da sua compra?")
    var valor =  readLine()!!.toDouble()

    var desconto = valor * 0.05
    var maisdesconto = String.format("%.2f", desconto).toString()
    var barato = valor - desconto
    var maisbarato = String.format("%.2f", barato).toString()

    println("O valor da sua compra com o um desconto de 5% é $maisbarato, com o desconto de: $maisdesconto")
}