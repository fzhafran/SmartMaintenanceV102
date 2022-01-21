package com.example.smartmaintenancev10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class sub_activity_history : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_history)
    }
    private fun main(){
        val equipid = "CAST-001"

        if (equipid > "CAST-001"){
            println("TEST")
        } else {
            println("ASAS")
        }
    }
}