package com.matrix.downloader

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate Called")
    }


    private inner class DownloadData : AsyncTask<String, Void, String>() {
        private val TAG = "DownloadData"

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
        }

        override fun doInBackground(vararg p0: String?): String {

        }

    }
}