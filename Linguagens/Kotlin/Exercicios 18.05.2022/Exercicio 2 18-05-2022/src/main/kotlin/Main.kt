fun main() {
    //2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

       for (i in 11 downTo 1 step 2) {
           println("Escreva os números para descobrirmos os pares e ímpares: ")
           var num = readln().toInt()
        if (num % (2) == 0) {
            println("Seu número é par.\n")
        } else {
            println("Seu número é ímpar.\n")
        }

    }
    println("Seu limite de consultas gratuitas diárias acabou. Adquira o plano premmium para mais consultas!")
}