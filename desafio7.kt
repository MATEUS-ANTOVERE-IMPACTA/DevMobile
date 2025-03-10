fun main() {
    val quantidade = 10
    var a = 1
    var b = 1
    print("Sequência de Fibonacci: $a, $b")
    for (i in 3..quantidade) {
        val proximo = a + b
        print(", $proximo")
        a = b
        b = proximo
    }
    println("\nFIM!")
}
