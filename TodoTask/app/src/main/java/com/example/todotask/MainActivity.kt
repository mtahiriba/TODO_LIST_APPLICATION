package com.example.todotask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText

import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var list: ListView
    val data = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.listItems)


        data.add("Muhammad Tahir")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)

        list.adapter = adapter

    }

    fun btnClick(view: View){
        val value = findViewById<EditText>(R.id.value).text.toString()
        if(value != ""){
            data.add(value)
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
            list.adapter = adapter
            findViewById<EditText>(R.id.value).setText("")
        }
        else
            Toast.makeText(this, "Please Add Item", Toast.LENGTH_SHORT).show()
    }
}