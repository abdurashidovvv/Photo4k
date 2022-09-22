package com.abdurashidov.photo4k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.abdurashidov.photo4k.databinding.ActivityMainBinding
import com.abdurashidov.photo4k.models.MyData
import com.abdurashidov.photo4k.models.MySharedPreference

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        MySharedPreference.init(this)

        MyData.allListData()
        MyData.techListData()
        MyData.animalListData()
        MyData.gradientListData()
        MyData.natureListData()
        MyData.blackListData()

        MyData.likeList=MySharedPreference.obektString

    }

    override fun onStop() {
        super.onStop()
        MySharedPreference.obektString=MyData.likeList
    }
}