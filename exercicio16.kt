fun main(){
    println("Quantos dias você trabalhou esse mês?")
    var dias = readLine()!!.toDouble()

    var salario = (dias*8)*25
    var salariofinal = String.format("%.2f", salario).toString()

    print("Seu sálaio esse mês é: $salariofinal")
}