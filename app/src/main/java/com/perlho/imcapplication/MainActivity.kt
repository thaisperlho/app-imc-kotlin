package com.perlho.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "entrei no CREATE - estou criando a tela")

    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "entrei no START - deixei a tela vicivel para voçê")
    }
}