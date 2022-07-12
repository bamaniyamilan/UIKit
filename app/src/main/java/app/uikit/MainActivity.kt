package app.uikit

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        isNetworkConnected()
        checkInternet()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun checkInternet() {
        if (isNetworkConnected() == true)
            Handler().postDelayed(Runnable {startActivity(Intent(applicationContext, LoginActivity::class.java))}, 2000)
        else
            Toast.makeText(applicationContext, "Please Check Internet Connection", LENGTH_LONG).show()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun isNetworkConnected(): Boolean {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null && cm.activeNetworkInfo!!.isConnected
    }
}