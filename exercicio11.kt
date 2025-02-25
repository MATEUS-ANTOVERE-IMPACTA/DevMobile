fun main(){
    println("Largura da Parede em metros?")
    var largura = readLine()!!.toDouble()
    println("Altura da Parede em metros?")
    var altura = readLine()!!.toDouble()

    var soma = altura * largura
    println("Área a ser pintada = $soma")

    var tinta = soma / 2
    print("A quantidade de litros de tinta a ser usada é : $tinta")
}