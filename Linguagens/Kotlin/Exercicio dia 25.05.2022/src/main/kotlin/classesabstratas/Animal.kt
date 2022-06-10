package classesabstratas
open class Animal(var nome: String ,var idade: Int ,var som: String ,
                  var corre: Boolean) {


    open fun emitirSom() {
        println("Emitindo som: ")
    }
}
