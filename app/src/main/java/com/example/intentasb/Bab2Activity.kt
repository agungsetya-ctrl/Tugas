package com.example.intentasb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bab2.*

class Bab2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bab2)

        val bundle = intent.extras
        val enim = bundle?.get("nim")
        val enama = bundle?.get("nama")
        val enilai = bundle?.get("nilai")
        val keterangan = bundle?.get("Keterangan")
        nime.text=enim.toString()
        name.text=enama.toString()
        nilaie.text=enilai.toString()
        keterangane.text=keterangan.toString()
    }
}
