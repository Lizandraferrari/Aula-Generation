package classesabstratas.classesabstratas
import classesabstratas.Bichopreguica
import classesabstratas.Cachorro
import classesabstratas.Cavalo
fun main() {
    var cachorro = Cachorro("Astolfo",10,"Auau",
        true
    )
    var cavalo = Cavalo("Alazão", 20, "UNHIIIHIHIHI",true
    )
    var bichopreguica = Bichopreguica("Fedido",42,"Não sei",false
    )
    cachorro.emitirSom()
    cavalo.emitirSom()
    bichopreguica.emitirSom()
}