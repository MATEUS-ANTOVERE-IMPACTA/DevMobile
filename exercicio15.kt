fun main(){
    println("Quantos dias você passou com o carro ?")
    var dias = readLine()!!.toDouble()

    println("Quantos KM você percorreu durante esses dias?")
    var km = readLine()!!.toDouble()

    var valorkm = km * 0.20
    var valordias = dias * 90

    var total = valordias + valorkm
    var totalcerto = String.format("%.2f", total).toString()

    println("O valor total do passeio foi $$totalcerto")
}