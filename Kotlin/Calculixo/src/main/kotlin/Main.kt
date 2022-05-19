fun sub(num1:Double , num2:Double) {
    var res = num1-num2
    println("\nO resultado da subtração é: $res. Obrigada por utilizar nossa calculixo!\n")
}fun multi(num1:Double , num2:Double) {
    var res = num1*num2
    println("\nO resultado da multiplicação é: $res . Obrigada por utilizar nossa calculixo!\n")
}fun divis(num1:Double , num2:Double) {
    var res = num1/num2
    println("\nO resultado da divisão é: $res. Obrigada por utilizar nossa calculixo!\n")
}fun soma(num1: Double, num2: Double) {
    var res = num1+num2
    println("\nO resultado da soma é: $res. Obrigada por utilizar nossa calculixo!\n")
}
fun main() {
    var num1 = 0.0
    var num2 = 0.0
    println("Escreva o primeiro número: ")
    num1 = readln().toDouble()
    println("Escreva o segundo número: ")
    num2 = readln().toDouble()
    println("Escreva a operação a ser realizada (1 para subtração, 2 para vezes," +
            "3 divisão, 4 para soma.): ")
    var tijolo = readln().toInt()

    when(tijolo){
        1 ->sub(num1, num2)
        2 ->multi(num1, num2)
        3 ->divis(num1, num2)
        4 ->soma(num1, num2)


    }

}
