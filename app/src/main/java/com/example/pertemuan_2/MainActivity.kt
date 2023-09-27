package com.example.pertemuan_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuan_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnTest1.setOnClickListener{
                val enteredName = namaInputan.text.toString()
                val message = "hello $enteredName"
                Toast.makeText(this@MainActivity,message, Toast.LENGTH_LONG).show()
            }
        }
    }
}