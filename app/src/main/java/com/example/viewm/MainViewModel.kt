package com.example.viewm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {

   val factLiveDataObject = MutableLiveData("hey this is first Fact")


      //val factliveData:LiveData<String> // this livedata behind the scene is accessing mutable livedata
        //    get() = factLiveDataObject




    fun updated(){
        factLiveDataObject.value = "this is stupid fact"
    }
}
