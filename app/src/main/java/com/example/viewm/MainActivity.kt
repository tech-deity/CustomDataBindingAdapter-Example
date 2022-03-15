package com.example.viewm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//   lateinit var mainViewModel : MainViewModel
   lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
  //      mainViewModel= ViewModelProvider(this).get(MainViewModel::class.java)
        val post = Post("Rafale",
            "dassault Aviation",
            "https://images.dassault-aviation.com/f_auto,q_auto,g_center,dpr_auto/wp-auto-upload/2/files/2021/11/DA00046495S.jpg")
        binding.post = post
        binding.lifecycleOwner = this

    }



}