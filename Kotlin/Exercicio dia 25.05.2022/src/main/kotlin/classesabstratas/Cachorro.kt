package classesabstratas

class Cachorro(
    override var nome: String ,override var idade: Int ,override var som: String ,
                  override var corre: Boolean
    ) : Animal{


    override fun emitirSom (){
        super.emitirSom()
        println("Auau!")
    }

}