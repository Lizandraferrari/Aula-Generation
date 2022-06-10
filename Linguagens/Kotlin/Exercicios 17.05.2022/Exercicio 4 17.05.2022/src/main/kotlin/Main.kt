import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    //4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
    //número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    //ímpar exiba o número elevado ao quadrado.
    println("Escreva o número a ser processado: ")
    val num = readln().toDouble()
    val par = num % 2
    val pato = num.pow(2)
    val mato = sqrt(num)

    if (par != 0.0){
        println("O número inserido é ímpar, e elevado ao quadrado é $pato.")
    }else{
        println("O número inserido é par, e sua raiz quadrada é $mato")
    }
}