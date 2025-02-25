fun main(){

    println("Digite seu nome: ")
    var nome = readln()!!

    println("Digite seu salário: ")
    var salario = readln()!!.toDouble()
    var salFormatado = String.format("%.2f", salario).toString()

    print("Nome do funcionário: \n${nome} \nsalario: \n${salFormatado}")
}