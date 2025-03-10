import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 6) // número entre 1 e 5
    println("Tente adivinhar o número sorteado pelo computador (entre 1 e 5):")

    val palpite = readLine()?.toIntOrNull()
    if (palpite == null) {
        println("Entrada inválida!")
    } else if (palpite == numeroSorteado) {
        println("Parabéns! Você acertou!")
    } else {
        println("Que pena! Você errou. O número sorteado foi $numeroSorteado.")
    }
}
