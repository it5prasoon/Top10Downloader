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

        val downloadData = DownloadData()
        downloadData.execute("URL goes here")
        Log.d(TAG,"onCreate: done")
    }


    companion object {
        private class DownloadData : AsyncTask<String, Void, String>() {
            private val TAG = "DownloadData"

            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)
                Log.d(TAG,"onPostExecute: parameter is $result")
            }

            override fun doInBackground(vararg p0: String?): String {
                Log.d(TAG, "doInBackground: starts with ${p0[0]}")
                return "doInBackground Completed"
            }

        }
    }
}