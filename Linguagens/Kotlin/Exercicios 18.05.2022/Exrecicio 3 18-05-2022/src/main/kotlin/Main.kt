fun main() {
    /* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
       21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
       idade for =-99. (WHILE)
    */
    var idade = 0
    var aux1= 0
    var aux2 = 0

    while (idade != -99){
        print("Insira sua idade: ")
        idade = readln().toInt()

        if (idade > 0 && idade < 21) {
            aux1++
        }
        if (idade > 50) {
            aux2++
        }
    }
    println("\nPessoas com menos de 21 anos: $aux1")
    println("\nPessoas com mais de 50 anos: $aux2")
}
