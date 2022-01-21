package com.example.smartmaintenancev10

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)


        ScannerScreenActivityBtn.setOnClickListener {
           val intent= Intent(this, ScannerActivity::class.java)
            startActivity(intent);
        }

        cardform.setOnClickListener {
            val i = Intent (Intent.ACTION_VIEW, Uri.parse("https://dosys.medionindonesia.com/share/page/site/medion/document-details?nodeRef=workspace://SpacesStore/a66b1f38-754f-4ba3-8f03-aff2fa725665"))
            startActivity(i)
        }

    }
    fun main(args: Array<String>){

        val equipid : String


    }

}



