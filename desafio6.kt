fun main() {
    println("Digite o primeiro termo da PA:")
    val primeiroTermo = readLine()?.toIntOrNull() ?: 0
    println("Digite a razão da PA:")
    val razao = readLine()?.toIntOrNull() ?: 0

    var termo = primeiroTermo
    var soma = 0
    print("PA: ")
    for (i in 1..10) {
        print("$termo ")
        soma += termo
        termo += razao
    }
    println("\nSoma dos 10 termos: $soma")
}
