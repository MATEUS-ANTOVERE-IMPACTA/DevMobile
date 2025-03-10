import kotlin.random.Random

fun main() {
    val vetor = IntArray(20) { Random.nextInt(0, 100) }
    println("Vetor gerado: ${vetor.joinToString(", ")}")

    val vetorOrdenado = vetor.sorted()
    println("Vetor ordenado: ${vetorOrdenado.joinToString(", ")}")
}
