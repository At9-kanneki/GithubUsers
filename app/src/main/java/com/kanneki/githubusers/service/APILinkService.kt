package com.kanneki.githubusers.service

import com.kanneki.githubusers.module.UserDetailModule
import com.kanneki.githubusers.module.UserModule
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface APILinkService {

    @GET("users")
    fun getAll(): Observable<List<UserModule>>

    @GET("users/{userName}")
    fun getDetailData(@Path("userName") name: String): Observable<UserDetailModule>
}