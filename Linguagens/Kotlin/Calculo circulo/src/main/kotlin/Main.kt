fun main(){
    //1 - Faça um programa em que o usuário digite
// o diâmetro de um círculo e calcule a área e o perímetro dele
    //A = 3.14159265359.r²
    //C = 2 * π * r
    println("Digite o valor do diâmetro do círculo que calcularemos a área e o perímetro: ")
    val diametro = readln().toDouble()
    val raio = diametro/2
    val area = 3.14*(raio*raio)
    //val area = pi* raio.pow(n:2) para elevar a potencia
    val perimetro = 2*3.14*raio
    println("O valor da area é:" + area + " e o perimetro é $perimetro")
    println("Obrigado por não utilizar o google para pesquisar a resposta " +
            "e apoiar os pequenos desenvolvedores!")
}