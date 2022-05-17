fun main() {
//3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:
// 10-14 infantil
// 15-17 juvenil
// 18-25 adulto
    println(
        "   Bem-vindo a escola de natação Generation!" +
                "\nInsira o nome do aluno(a) que está sendo matriculado: "
    )
    var nome = readln()

    println("Obrigado $nome. Agora escreva sua idade: ")
    val idade = readln().toInt()

    if (idade < 10) {
        println(
            "Sentimos muito $nome... Você ainda não tem idade suficiente para" +
                    "se matricular.\nEm mais " + (10 - idade) + " ano(s) você já terá idade suficiente!"
        )
    } else if (idade in 10..14) {
        println("Sua matricula foi feita na modalidade Infantil $nome!")

    } else if (idade >= 15 && idade <= 17) {
        println("Sua matricula foi feita na modalidade Juvenil $nome!")

    } else if (idade in 18..25) {
        println("Sua matricula foi feita na modalidade Adulto $nome!")

    } else {
        println("Sentimos muito $nome... Você não tem mais idade para se inscrever em nossa escola.")
    }
}