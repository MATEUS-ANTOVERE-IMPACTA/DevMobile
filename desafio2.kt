fun main() {
    println("Digite o comprimento do primeiro segmento:")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o comprimento do segundo segmento:")
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite o comprimento do terceiro segmento:")
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    if (a < b + c && b < a + c && c < a + b) {
        println("É possível formar um triângulo com os segmentos.")
    } else {
        println("Não é possível formar um triângulo com os segmentos.")
    }
}
