fun main(){
    val ferrari = Carros()
    ferrari.cor = "Vermelho"
    ferrari.altura = 1.60
    ferrari.largura = 4.50

    ferrari.primeiramarcha()
    ferrari.segundamarcha()

    ferrari.marchas()

    println("Cor do carro: ${ferrari.cor}")
    println("Cor do altura: ${ferrari.altura}")
    println("Largura: ${ferrari.largura}")
}