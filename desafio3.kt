fun main() {
    println("Digite o comprimento do primeiro lado:")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o comprimento do segundo lado:")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o comprimento do terceiro lado:")
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    if (a < b + c && b < a + c && c < a + b) {
        // Classificação do triângulo
        if (a == b && b == c) {
            println("Os segmentos formam um triângulo EQUILÁTERO.")
        } else if (a == b || a == c || b == c) {
            println("Os segmentos formam um triângulo ISÓSCELES.")
        } else {
            println("Os segmentos formam um triângulo ESCALENO.")
        }
    } else {
        println("Os segmentos não podem formar um triângulo.")
    }
}
