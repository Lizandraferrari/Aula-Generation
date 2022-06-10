fun main() {
    //2- Faça um programa que entre com três números e coloque em ordem crescente.
    println("Insira o primeiro valor, para colocarmos em ordem crescente: ")
    val num1 = readln().toInt()

    println("Insira o segundo valor, para colocarmos em ordem crescente: ")
    val num2 = readln().toInt()

    println("Insira o terceiro valor, para colocarmos em ordem crescente: ")
    val num3 = readln().toInt()

    if(num1<num2 && num2<num3){
         println("A ordem crescente dos números é: $num1, $num2, $num3.")

    }else if(num2<num1 && num1<num3){
        println("A ordem crescente dos números é: $num2, $num1, $num3.")

    }else if(num3<num1 && num1<num2){
        println("A ordem crescente dos números é: $num3, $num1, $num2.")

    }else if(num1<num3 && num3<num2){
        println("A ordem crescente dos números é: $num1, $num3, $num2.")

    }else if(num2<num3 && num3<num1) {
        println("A ordem crescente dos números é: $num2, $num3, $num1.")
    }else{
        println("A ordem crescente dos números é: $num3, $num2, $num1.")
    }
    }