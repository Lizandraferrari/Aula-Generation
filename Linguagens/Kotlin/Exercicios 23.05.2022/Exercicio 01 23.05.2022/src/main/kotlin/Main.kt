fun main() {
    //1) Crie uma classe cliente e apresente os atributos e métodos referentes
    //esta classe, em seguida crie um objeto cliente, defina as instancias deste
    //objeto e apresente as informações deste objeto no console.
    println("!!!!Acesso exclusivo dos vendedores!!!!\n\n\nDigite seu código de funcionário: ")
    val cod=readln().toInt()

    println("\nEntão vamos cadastrar sua venda!\n")
    val mano = Cliente()

    println("Insira o nome do cliente: \n")
    mano.cliente = readln()
    println("\nInsira o ano de nascimento: \n")
    mano.ano = readln().toInt()
    println("\nInsira o CPF do cliente: \n")
    mano.cpf = readln()
    println("\nInsira o nome do produto comprado: \n")
    mano.produto = readln()
    println("\nInsira o valor do produto: \n")
    mano.valor = readln().toDouble()
    val comissao = mano.valor*0.06

    println("Vendedor $cod, você vendeu um "+ mano.produto +" ao(a) "+ mano.cliente + "" +
            ", nascido no ano de "+ mano.ano +" com CPF de número "+ mano.cpf +", " +
            "e o valor dessa compra foi R$"+mano.valor+"." +
            "\nVocê ganhou 6% de comissão nessa venda, dando R$$comissao.")


}