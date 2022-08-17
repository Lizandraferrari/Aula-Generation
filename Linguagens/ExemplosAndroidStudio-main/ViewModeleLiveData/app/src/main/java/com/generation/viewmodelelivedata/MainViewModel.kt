package com.generation.viewmodelelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var cont = MutableLiveData<Int>(0)

    fun add(){
        cont.value = cont.value?.plus(1)
    }

    fun sub(){
        cont.value =cont.value?.minus(1)
    }

    fun zerar(){
        cont.value =0
    }
}