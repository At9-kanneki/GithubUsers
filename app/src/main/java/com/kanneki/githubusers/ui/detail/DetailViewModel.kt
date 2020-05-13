package com.kanneki.githubusers.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kanneki.githubusers.module.UserDetailModule
import com.kanneki.githubusers.service.ApiService
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

class DetailViewModel {

    private val detailData = MutableLiveData<UserDetailModule>()
    val getDetailData: LiveData<UserDetailModule> = detailData

    fun getData(name: String) {
        ApiService().apiService.getDetailData(name)
            .subscribeOn(Schedulers.io())
            .subscribe( object : Observer<UserDetailModule> {
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable?) {
                }

                override fun onNext(data: UserDetailModule?) {
                    detailData.postValue(data)
                }

                override fun onError(e: Throwable?) {
                }
            })
    }
}