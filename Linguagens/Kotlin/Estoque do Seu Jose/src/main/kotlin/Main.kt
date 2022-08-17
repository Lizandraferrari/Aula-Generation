fun main() {
//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
//trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
//programa deverá atender as seguintes funcionalidades:
//
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.
    val produtos = mutableListOf<String>()
    while(true) {
        println("SUPER MERCADO GENERATION - Controle de estoque 666\n" +
                "O que deseja fazer?\n" +
                " 1- Inserir produto, 2- Remover produto, 3- Editar produto, " +
                "4- Listar os produtos, 5- Encerrar alterações do estoque")
        when(readln().toInt()) {
            1 -> inserirItem(produtos)
            2 ->{if (produtos.size == 0){
                println("Ainda não existem itens no estoque para serem removidos.\n")
            }else {
                removerItem(produtos)
            }}
            3 ->{if (produtos.size == 0){
                println("Ainda não existem itens no estoque para serem editados.\n")
            } else {
                editEstoque(produtos)
            }}
            4 ->{if (produtos.size == 0){
                println("Ainda não existem itens no estoque para serem listados.\n")
            }else {
                listEstoque(produtos)
            }}
            5 -> break
        }
    }
}

fun inserirItem (produtos: MutableList<String>) {
    while (true) {
        println("Digite os produtos para serem adicionados ao estoque ou aperte Enter para voltar ao menu: ")
        val item = readln()
        if (item == "") {
            break
        } else {
            produtos.add(item)
        }
    }
}
fun removerItem (produtos: MutableList<String>) {
    while (true) {
        println("Digite o produto que será retirado do estoque ou aperte Enter para voltar ao menu:")
        listEstoque(produtos)
        val item = readln()
        if (item == ""){
            break
        }else if (produtos.contains(item)) {
            produtos.remove(item)
            break
        } else {
            println("O produto $item não existe em estoque.")}
    }
}
fun editEstoque (produtos: MutableList<String>) {
    println("Digite o nome de qual  dos produtos você quer editar: ")
    listEstoque(produtos)
    val edit = readln()
    if(produtos.contains(edit)) {
        val index = produtos.indexOf(edit)
        println("Digite o nome do produto")
        val nome = readln()
        produtos[index] = nome
        println("O estoque foi atualizado!")
    } else {
        println("O Item $edit não se encontra no estoque.")
    }

}
fun listEstoque (produtos: MutableList<String>) {
    println("Estoque:")
    for (i in 0 until produtos.size) println("${i+1}- Item: ${produtos[i]}")
}



