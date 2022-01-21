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
            val i = Intent (Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17O5Wof5INqNq-mwFiSPsiImXFR5lNyB3/view?usp=sharing"))
            startActivity(i)
        }
        cardspec.setOnClickListener {
            val intent = Intent(this,sub_activity_spesification::class.java)
            startActivity(intent);
        }
        cardmanual.setOnClickListener {
            val intent = Intent(this,sub_activity_manualbook::class.java)
            startActivity(intent);
        }
        cardpk.setOnClickListener {
            val intent = Intent(this,sub_activity_pk::class.java)
            startActivity(intent);
        }
        cardperformance.setOnClickListener {
            val intent = Intent(this,sub_activity_performance::class.java)
            startActivity(intent);
        }
        cardstandard.setOnClickListener {
            val intent = Intent(this,sub_activity_standardmtc::class.java)
            startActivity(intent);
        }
        cardwiring.setOnClickListener {
            val intent = Intent(this,sub_activity_wiring::class.java)
            startActivity(intent);
        }
        cardhistory.setOnClickListener {
            val intent = Intent(this,sub_activity_history::class.java)
            startActivity(intent);
        }

    }


}



