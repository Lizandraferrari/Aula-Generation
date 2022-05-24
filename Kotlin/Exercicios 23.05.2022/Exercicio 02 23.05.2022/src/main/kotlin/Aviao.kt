class Aviao(
    var pessoa:String,
    var idade:Int,
    var show:String,
    var meet:String,
    var email:String,
    var comanda:Double) {

    var cadastro = mutableListOf<String>()
    fun cadastrar(cadastro: mutableListOf<String>) {
        var cadastro = mutableListOf(
        comanda to 0.0,
        pessoa to "",
        idade to 0,
        show to "",
        meet to "",
        email to "")

    }
}

