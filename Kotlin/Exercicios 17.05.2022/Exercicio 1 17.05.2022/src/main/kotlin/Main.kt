fun main() {
//    1- Faça um programa que receba três inteiros e diga qual deles é o maior.
    println("Coloque o número 1: ")
    val num1 = readln().toInt()

    println("Coloque o número 2: ")
    val num2 = readln().toInt()

    println("Coloque o número 3: ")
    val num3 = readln().toInt()

    if(num1>num2 && num1>num3){
        println("O número $num1 é o maior dos três inseridos.")
    }else if(num2>num1 && num2>num3){
        println("O número $num2 é o maior dos três inseridos.")
    }else
        println("O número $num3 é o maior dos três inseridos.")
}