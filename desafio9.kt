fun fibonacci(termos: Int) {
    if (termos <= 0) {
        println("Número de termos deve ser maior que 0.")
        return
    }

    var a = 1
    var b = 1
    print("$a >> ")
    if (termos > 1) {
        print("$b >> ")
    }

    for (i in 3..termos) {
        val proximo = a + b
        print("$proximo >> ")
        a = b
        b = proximo
    }
    println("FIM")
}

fun main() {
    println("Digite quantos termos da sequência de Fibonacci você deseja exibir:")
    val termos = readLine()?.toIntOrNull() ?: 0
    fibonacci(termos)
}
