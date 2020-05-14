package com.kanneki.githubusers.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kanneki.githubusers.module.UserModule
import com.kanneki.githubusers.service.ApiService
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class MainViewModel : ViewModel() {

    private val dataList = MutableLiveData<List<UserModule>>()
    val getDataList: LiveData<List<UserModule>> = dataList

    fun getAll() {
        ApiService().apiService.getAll()
            .subscribeOn(Schedulers.io())
            .subscribe ( object : Observer<List<UserModule>> {
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable?) {
                }

                override fun onNext(list: List<UserModule>?) {
                    dataList.postValue(list)
                }

                override fun onError(e: Throwable?) {
                    dataList.postValue(null)
                }

            })
    }
}