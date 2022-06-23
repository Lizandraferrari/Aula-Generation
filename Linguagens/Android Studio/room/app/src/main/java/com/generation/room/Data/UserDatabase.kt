package com.generation.room.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//vamos declarar o banco de dados do room por meio da linha
@Database(entities = [Usuario::class], version = 1, exportSchema = false)
//as entities podem ser listas/arrays/etc, ou até mesmo classes, que são as informações de variaveis
//a serem armazenadas.
//exportSchema é a linha que gera o script segundo a informação de entities.
// ele foi deixado como "false" para gerar apenas quando solicitado
abstract class UserDatabase : RoomDatabase() {
    //para fazer um bando de dados local utilizando uma classe, ela deve ser abstrata.
    //após declaração de abstract class, indicamos que é uma RoomDatabase e importamos.
    abstract fun userDao(): UserDao
    //declarado função abstrata para puxar as informações da interface
    companion object{
        //precisamos declarar um companion object para passarmos as informações na mainview
        @Volatile
        //essa variavel serve para declarar ela de forma que fique visivel em todas as
        //threads assim que for instanciada.
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            //essa função é criada para verificar se a instancia já existe
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                //para dar prioridade onde está sendo executado
                val instance = Room.databaseBuilder(
                    //então determinamos essa variavel na database e colocamos o contexto
                    context.applicationContext,
                    //contexto direto na aplicação, e então convertemos a classe para ler corretamente
                    UserDatabase::class.java,
                    "user_database"
                ).build()
                //então inserimos o .build() para "construir" o banco de dados segundo a info
                //inserida na função
                INSTANCE = instance
                //declaramos a variavel anterior com a nova info da variavel criada
                //e então retornamos ela na função como resultado
                return instance

                //agora precisamos criar um repositório para manter as informações
            }
        }
    }
}