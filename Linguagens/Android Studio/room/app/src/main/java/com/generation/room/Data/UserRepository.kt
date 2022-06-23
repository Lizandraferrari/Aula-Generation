package com.generation.room.Data

class UserRepository (private val userDao: UserDao) {
    //trazer objeto ao repositorio
    //vamos declarar como privado para não terem acesso livre aos dados, ou não ser invocado
    //de maneira incorreta.

    //agora vamos puxar uma função numa variavel local
    val selectUser = userDao.selectUser()
//não é necessario corrotinas por ser num banco local offline, então não precisa ser feito em backgrund

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
        //aqui inserimos a função de forma funcional para adicionar as info de usuario,
        //segundo a função criada na interface userDao, com as informações da classe usuario
        //trazendo ao banco
    }
}