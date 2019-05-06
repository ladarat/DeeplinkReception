package com.example.deeplinkreception

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class receptionSchemeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reception_scheme)

        val uri = intent.data
        uri?.let {
            checkDataIntent(it)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        finish()
    }

    private fun checkDataIntent(uri: Uri) {
        Log.i("Check", "Data : " + uri);

        for (key in uri.queryParameterNames) {
            Log.i("Check", "Key : $key")
        }

        val flag = uri.getQueryParameter("flag")

        Log.i("Check", "flag App : $flag")

    }
}
