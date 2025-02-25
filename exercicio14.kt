fun main(){
    println("Qual seu sálario?")
    var salario = readLine()!!.toDouble()

    var aumento = salario * 0.15
    var novosalario = salario + aumento
    var newsalario = String.format("%.2f",novosalario).toString()

    println("Seu novo sálario: $novosalario")
}