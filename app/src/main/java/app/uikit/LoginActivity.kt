package app.uikit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class LoginActivity : AppCompatActivity() {
    var email : EditText? = null
    var password : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun btnPressed(view: View) {
        if (email?.length()  == 0 && password?.length()==0)
            Toast.makeText(applicationContext,"Please Enter Email and Password",LENGTH_LONG).show()
        else
            startActivity(Intent(applicationContext,HomeActivity::class.java))
    }
}