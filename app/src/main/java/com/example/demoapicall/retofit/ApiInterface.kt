package com.example.demoapicall.retofit
import com.example.demoapicall.model.LoginRequestDataClass
import com.example.demoapicall.model.LoginResponseDataClass
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {

    @Headers("Apikey: 1w6j8f3udyi0ravne7zsxiqacph5b2klgto9xm4p")
    @POST("login/")
    fun login(@Body loginRequestDataClass: LoginRequestDataClass): Call<LoginResponseDataClass>
}