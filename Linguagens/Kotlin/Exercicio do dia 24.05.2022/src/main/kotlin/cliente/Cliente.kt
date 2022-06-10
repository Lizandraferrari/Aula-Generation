package cliente
import java.lang.Exception

//Cria uma Classe cliente.Cliente, contendo os atributos encapsulados, um construtor padrão
// e pelo menos mais duas opções de construtores conforme sua percepção, com os atributos:
// nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
//A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
//Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
//Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.

class Cliente(private var nome:String) {
    private var endereco = ""
    private var telefone = ""

    private var listadeCompra = mutableListOf<String>()

    constructor(nome:String, endereco:String): this(nome){
        this.endereco = endereco
    }
    constructor(nome: String, endereco: String, telefone:String)
      : this(nome, endereco){
        this.telefone=telefone
    }

    init{
        if (nome == ""){
            throw Exception("\n\nAlguma informação foi inserida de forma INVÁLIDA!\n")
        }
    }

    fun adicionar (compra:String){
        if (compra!= ""){
            listadeCompra.add(compra)
            println("\n\nO produto foi adicionado com sucesso!")
            }else{
            println("\n\nProduto não foi inserido com sucesso...")
            }
        }

    fun remover(compra: String) {
        if (listadeCompra.contains(compra)) {
            listadeCompra.remove(compra)
            println("\n\nO produto foi removido com sucesso!")
        } else {
            println("\n\nEsse produto não existe em estoque!")
        }
    }
    fun listCompra(){
        println("\n\n******PRODUTOS EM ESTOQUE******\n\n\n\n")
        listadeCompra.forEach{it
            println(it)

        }
    }
}