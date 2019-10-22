package com.example.intentasb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.app.Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        proses.setOnClickListener {
            intent = Intent(this, Bab2Activity::class.java)
            intent.putExtra("nim", nim.text)
            intent.putExtra("nama", nama.text)
            intent.putExtra("nilai", nilai.text)
            if (nilai.text.toString().toInt()>=80) {
                intent.putExtra("Keterangan", "A")
            }
            else if (nilai.text.toString().toInt()>=60) {
                intent.putExtra("Keterangan", "B")
            }
            else if (nilai.text.toString().toInt()>=40) {
                intent.putExtra("Keterangan", "C")
            }
            else if (nilai.text.toString().toInt()>=20) {
                intent.putExtra("Keterangan", "D")
            }
            else if (nilai.text.toString().toInt()>=0) {
                intent.putExtra("Keterangan", "E")
            }
            startActivity(intent)
        }
    }
}
