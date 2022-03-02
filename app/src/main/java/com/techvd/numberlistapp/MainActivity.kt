package com.techvd.numberlistapp

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.graphics.Insets.add
import androidx.core.view.OneShotPreDrawListener.add
import com.techvd.numberlistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val array = arrayOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",
        "17","18","19","20")

     //  val adapter  = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array)

        //binding.listItems.adapter = adapter

        val arraylist : ArrayList<Data> = ArrayList()
        arraylist.add(Data("0","audio_0"))
        arraylist.add(Data("1","audio_1"))
        arraylist.add(Data("2","audio_2"))
        arraylist.add(Data("3","audio_3"))
        arraylist.add(Data("4","audio_4"))
        arraylist.add(Data("5","audio_5"))
        arraylist.add(Data("6","audio_6"))
        arraylist.add(Data("7","audio_7"))
        arraylist.add(Data("8","audio_8"))
        arraylist.add(Data("9","audio_9"))
        arraylist.add(Data("10","audio_10"))

        val adapter : CustomAdapter = CustomAdapter(arraylist)
        binding.listItems.adapter = adapter


    }
}