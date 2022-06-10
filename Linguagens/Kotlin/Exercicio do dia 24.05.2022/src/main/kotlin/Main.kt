import cliente.Cliente

fun main() {
    //Cria uma Classe cliente.Cliente, contendo os atributos encapsulados, um construtor
// padrão e pelo menos mais duas opções de construtores conforme sua percepção,
// com os atributos: nome (String), endereço (String), telefone (String),
// listaDeCompras (mutableListOf<Strings>()).
    //
    //A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    //Crie um método para verificar o nome ao inicializar a classe e,
// caso esteja vazio, jogue uma exceção. Ao instanciar a classe cliente na função main(),
// não esquecer de colocar dentro de um bloco try catch.

    println("BEM VINDO(A) AO SISTEMA DE ASSINATURA DE VENDAS DA PONTO QUENTE\n\n\n")
    println("Digite o nome do cliente: \n")
    var nome = readln()
            val pessoa = Cliente(nome)
        while(true){
        println("Digite a cidade onde o cliente reside: \n")
        var endereco = readln()
        println("Digite o telefone com DDD: \n")
        var telefone = readln()
        println("Escreva o nome do produto: \n")

        try {
            nome=""
            break
        }catch (e:Exception){

        }
        try {
            var listadecompras = ""
            break
        }catch (e:Exception){

        }

    }

    while (true) {
            println("DIGITE A OPERAÇÃO A SER REALIZADA NO SISTEMA: \n")
            println("1 - Adicionar produto ao estoque")
            println("2 - Remover produto do estoque")
            println("3 - Mostrar produtos em estoque")
            println("4 - Encerrar")

            print("Iniciar função ")
            val escolha = readln().toInt()

    when(escolha){
        1 ->{
            println("Digite um item para adicionar ao estoque: \n")
            val compra = readln()
            pessoa.adicionar(compra)
        }
        2 ->{
            println("Digite um item para remover do estoque: \n")
            val compra = readln()
            pessoa.remover(compra)
        }
        3 ->{
            println("Os produtos em estoque são:  \n")
            pessoa.listCompra()
        }
        4 ->{
            break
        }


    }

    }

}