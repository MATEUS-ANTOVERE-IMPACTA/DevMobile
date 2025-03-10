fun main(){
    println("Quantos cigarros você fuma por dia ?")
    var cigarro = readLine()!!.toDouble()

    println("Você fuma há quanto tempo? Responda por quantidade de meses")
    var tempo = readLine()!!.toDouble()

    var min = ((tempo*30)*24)*60
    var qtd = (cigarro * min)

    var dias = (qtd / 60)/24

    println("Você já perdeu $dias fumando essa quantidade de cigarro! PARE AGORA")
}