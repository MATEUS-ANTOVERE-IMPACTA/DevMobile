fun main(){
    println("Digite uma distância em metros: ")
    var n1 = readLine()!!.toDouble()

    var transformar = n1 * 100
    var transformarok = String.format("%.0f", transformar).toString()

    print("Metros transformados para centimetros: $transformarok cm")
}