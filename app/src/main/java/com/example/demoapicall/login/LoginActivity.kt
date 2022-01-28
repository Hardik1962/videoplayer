package com.example.demoapicall.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.demoapicall.R
import com.example.demoapicall.home.HomeActivity
import com.example.demoapicall.model.LoginRequestDataClass
import com.example.demoapicall.model.LoginResponseDataClass
import com.example.demoapicall.retofit.ApiClient
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    var email = ""
    var password = ""
    var apikey = "1w6j8f3udyi0ravne7zsxiqacph5b2klgto9xm4p"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        btnLogin.setOnClickListener {
         //   if (validateLogin()){
             //   login()
                startActivity(Intent(this,HomeActivity::class.java))
         //tu   }
        }
    }


    fun validateLogin():Boolean{

        email = et_email.text.toString().trim()
        password = et_password.text.toString().trim()
        if (email.isEmpty()){
            Toast.makeText(this,"Enter Email",Toast.LENGTH_SHORT).show()
            return false
        }else if (password.isEmpty()){
            Toast.makeText(this,"Enter Password",Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    private fun login(){

        progeress.visibility = View.VISIBLE

        val call: Call<LoginResponseDataClass> =ApiClient.getClient.login(LoginRequestDataClass("jeck@grr.la","Jeck@123","123","IOS"))
        call.enqueue(object :Callback<LoginResponseDataClass>{
            override fun onResponse(
                call: Call<LoginResponseDataClass>,
                response: Response<LoginResponseDataClass>
            ) {
                if (response.isSuccessful){
                    progeress.visibility = View.GONE
                    if (response.body()?.status == 1){
                        Toast.makeText(this@LoginActivity,response.body()?.message,Toast.LENGTH_SHORT).show()
                    } else{
                        Toast.makeText(this@LoginActivity,response.body()?.message,Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onFailure(call: Call<LoginResponseDataClass>, t: Throwable) {
                progeress.visibility = View.GONE
                Toast.makeText(this@LoginActivity,t.message.toString(),Toast.LENGTH_SHORT).show()
            }

        })
    }



}