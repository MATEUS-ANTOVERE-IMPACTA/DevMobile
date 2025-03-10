fun main() {
    val limiteVelocidade = 80
    val valorMultaPorKm = 5

    println("Digite a velocidade do carro (Km/h):")
    val velocidade = readLine()?.toIntOrNull() ?: 0

    if (velocidade > limiteVelocidade) {
        val excesso = velocidade - limiteVelocidade
        val multa = excesso * valorMultaPorKm
        println("Você foi multado! Excedeu o limite em $excesso Km/h.")
        println("Valor da multa: R$$multa,00")
    } else {
        println("Velocidade dentro do limite. Dirija com segurança!")
    }
}
