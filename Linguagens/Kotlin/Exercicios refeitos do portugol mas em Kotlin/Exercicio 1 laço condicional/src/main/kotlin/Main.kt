fun main(){
    //EXERCÍCIOS
    //1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
    //de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
    //regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
    //excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
    //verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
    //da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
    //ZERO.
    var kg: Int?
    var multa: Int?
    var exc: Int?
    println("Insira quantos KG de tomate foram trazidos: ")
    kg = readln().toInt()
    if(kg > 50) {
        exc = kg-50
        multa = exc * 4
        println("Você deve pagar R$ $multa para o governo por ter um excedente de $exc kilos.")
    }
    else {
        println("Você não deve ao governo.")

    }

    }

