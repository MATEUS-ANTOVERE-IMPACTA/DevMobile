fun main(){

    println("Digite um número: ")
    var n1 = readLine()!!.toDouble()
    var sucessor = n1 + 1
    var antecessor = n1 - 1

    print("Sucessor: ${sucessor} \nAntecessor: ${antecessor}")
}