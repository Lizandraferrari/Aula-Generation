package classesabstratas

class Bichopreguica
    (override var nome: String ,override var idade: Int ,override var som: String ,
     override var corre: Boolean
) : Animal


override fun emitirSom (){
    super.emitirSom()
    println("sei lá vei")
}
