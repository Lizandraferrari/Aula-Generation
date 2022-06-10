package com.generation.frasesrecyclerview.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generation.frasesrecyclerview.databinding.ActivityMainBinding
import com.generation.frasesrecyclerview.databinding.CardLayoutBinding
import com.generation.frasesrecyclerview.model.Frases
//Essa classe é feita utilizando o metodo adapter para referenciar a data class
/* Utilizando o "recyclerview para reduzir o número de linhas, evitando redigitação e trazendo
/ as informações de uma classe pra outra, junto com suas variáveis e informações a serem implementadas
nas partes necessárias do código.
*/

class FrasesAdapter : RecyclerView.Adapter<FrasesAdapter.FrasesViewHolder>() {

//O adapter é declarado no fragmento "FrasesFragment". Mais info lá.
    private var listFrases = emptyList<Frases>()

    class FrasesViewHolder(var binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)


    //com base no root binding ativado na build gradle, podemos converter infos de uma class para outra
//e utilizando o referenciamento ao frases, com o view holder no recycler view podemos trazer ao código
//as informações pedidas.
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FrasesViewHolder {
        return FrasesViewHolder(
            CardLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
//o return referencia as informações a serem criadas dentro do layout, de forma que seja
        // destacado do foreground. As informações referenciadas são da classe frases e trazidas pelo
        //ViewHolder, sendo as informações sem as info de variaveis, por não terem os devidos id.
    }

    override fun onBindViewHolder(holder: FrasesViewHolder, position: Int) {
        var frases = listFrases[position]
        //aqui iremos referenciar de acordo com as infos de id no arquivo xml, e as obrigatórias
        //do data class "frases" usando essa função para mostrar as informações presentes no
        //fragmento de classse, aqui é o "FrasesFragment", e trazendo a lista com as info lá escritas

        //usando a função holder, as id de referencia e o root binding, agora vamos invocar cada variavel
        holder.binding.textCitacao.text = frases.citacao
        holder.binding.textAutor.text = frases.autor

    }

    override fun getItemCount(): Int {
        return listFrases.size
        //assim a quantidade da lista aparecerá quando invocada
    }

    fun setList(list: List<Frases>) {
        listFrases = list
        notifyDataSetChanged()
        //Assim as mudanças ou novas informações postas subirão no app

    }
}