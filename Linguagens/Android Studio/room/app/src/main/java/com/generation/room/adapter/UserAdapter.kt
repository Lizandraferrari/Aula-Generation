package com.generation.room.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.generation.room.Data.Usuario
import com.generation.room.databinding.CardLayoutBinding

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    var userList = emptyList<Usuario>()

    class UserViewHolder (val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(CardLayoutBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]

        holder.binding.textId.text = user.id.toString()
        holder.binding.textNome.text = user.nome
        holder.binding.textSobrenome.text = user.sobrenome
        holder.binding.textIdade.text = user.idade.toString()

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setList(list: List<Usuario>){
        userList = list
        notifyDataSetChanged()
    }

}