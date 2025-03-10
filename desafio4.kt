import kotlin.random.Random

fun main() {
    println("Bem-vindo ao JoKenPo!")
    println("Escolha uma opção:")
    println("1 - Pedra")
    println("2 - Papel")
    println("3 - Tesoura")

    val escolhaUsuario = readLine()?.toIntOrNull()
    if (escolhaUsuario !in 1..3) {
        println("Opção inválida!")
        return
    }

    val escolhaComputador = Random.nextInt(1, 4)
    val opcoes = mapOf(1 to "Pedra", 2 to "Papel", 3 to "Tesoura")

    println("Você escolheu: ${opcoes[escolhaUsuario]}")
    println("Computador escolheu: ${opcoes[escolhaComputador]}")

    if (escolhaUsuario == escolhaComputador) {
        println("Empate!")
    } else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
        (escolhaUsuario == 2 && escolhaComputador == 1) ||
        (escolhaUsuario == 3 && escolhaComputador == 2)) {
        println("Você venceu!")
    } else {
        println("Você perdeu!")
    }
}
