class Aviao(
    var pessoa:String,
    var idade:Int,
    var show:String,
    var meet:String,
    var email:String) {
    fun main() {
        fun cadastrar() {
        pessoa=""
        idade=0
        show=""
        meet=""
        email=""
        println("Bem-vindo(a) ao sorteio do ingresso do aviões do forró com direito a meet and greet!\n" +
                    "A cada 10 reais gastos na comanda de nosso estabelecimento, você ganha 1 número!!\n" +
                    "Digite o valor da sua comanda. ATENÇÃO!! Será necessário leva-la presencialmente" +
                    " para comprovar a veracidade caso seu número seja sorteado:"
        )
        var comanda = readln().toDouble()
        var num = comanda / 10
        num = Math.floor(num)

            if (comanda >= 10.00) {
                println("\nAgora digite seu nome completo: ")
                pessoa = readln()
                println("\nDigite sua idade: ")
                idade = readln().toInt()
                println("\nDigite seu e-mail: ")
                email = readln()
                println(
                    "\nDigite o estado de preferência para o show (em caso de previsão de datas nesse local" +
                            "superiores a 3 meses de espera, entraremos em contato para ver o que poderemos fazer): "
                )
                show = readln()
                println(
                    "\nAgora diga qual integrante do aviões do forró você quer conhecer no" +
                            " meet and greet: Felipão, Márcia Fellipe ou Solange Almeida:"
                )
                meet = readln()
            }
        }
    }
}
