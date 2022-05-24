fun main() {
//2) Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

    println(
        "Bem-vindo(a) ao sorteio do ingresso do aviões do forró com direito a meet and greet!\n" +
                "A cada 10 reais gastos na comanda de nosso estabelecimento, você ganha 1 número!!\n" +
                "Digite o valor da sua comanda. ATENÇÃO!! Será necessário leva-la presencialmente" +
                " para comprovar a veracidade caso seu número seja sorteado:")
    var comanda = readln().toDouble()
    var num = comanda / 10
    num = Math.floor(num)
    if (comanda >= 10.00) {
        println("\nAgora digite seu nome completo: ")
        var pessoa = readln()
        println("\nDigite sua idade: ")
        var idade = readln().toInt()
        println("\nDigite seu e-mail: ")
        var email = readln()
        println(
            "\nDigite o estado de preferência para o show (em caso de previsão de datas nesse local" +
                    "superiores a 3 meses de espera, entraremos em contato para ver o que poderemos fazer): "
        )
        var show = readln()
        println(
            "\nAgora diga qual integrante do aviões do forró você quer conhecer no" +
                    " meet and greet: Felipão, Márcia Fellipe ou Solange Almeida:"
        )
        var meet = readln()
        var num = comanda / 10
        num = Math.floor(num)
        println("Muito obrigado(a) " + pessoa + ", você possui " + num + " número(s) para o sorteio.")
        println(
            "Sua idade é " + idade + ", você colocou como preferência o estado de " + show +
                    " e quer conhecer a(o) " + meet + " do aviões do forró!\nBoa sorte no sorteio!" +
                    " As informações serão encaminhadas no seu e-mail: " + email + "\n"
        )
    }else{
        println("Você não bateu o valor mínimo na comanda para se inscrever nesse sorteio.")
    }
}

     fun Aviao.cadastrar() {
    }






