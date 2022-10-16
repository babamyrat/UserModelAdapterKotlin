package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.UserAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.models.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var adapter: UserAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initial()

    }

    private fun initial() {
        recyclerView = binding.recyclerView
        adapter = UserAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    private fun myUser(): ArrayList<UserModel>  {

        val userList = ArrayList<UserModel>()
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))
        userList.add(UserModel("Babamyrat",  "14", "https://cp14.nevsepic.com.ua/18/17551/1384767170-515045.jpg"))



       return userList
    }


}