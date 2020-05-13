package com.kanneki.githubusers.service

import com.kanneki.githubusers.helper.Constant
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiService {

    val logging = HttpLoggingInterceptor()
    val okHttpClient = OkHttpClient().newBuilder()
        .connectTimeout(30, TimeUnit.SECONDS) //設置連線Timeout
        .addInterceptor(setLeve())
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl(Constant.baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .client(okHttpClient)
        .build()

    val apiService = retrofit.create(APILinkService::class.java)

    fun setLeve(): HttpLoggingInterceptor {
        logging.level = HttpLoggingInterceptor.Level.BASIC
        return logging
    }
}