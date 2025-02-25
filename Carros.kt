class Carros {

    var cor: String = ""
    var altura: Double? = null
    var largura: Double? = null

    //Metódos
    fun primeiramarcha(){
        println("Engatando a primeira marcha")
    }

    fun segundamarcha(){
        println("Passando para a segunda marcha")
    }

    fun abrirportamotorista(){
        println("Abrir porta do motorista")
    }

    // chamar todas de uma vez ***this***
    fun marchas(){
        this.primeiramarcha()
        this.segundamarcha()
    }
}